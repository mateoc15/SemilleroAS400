package com.sophos.test;


import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sophos.logic.Excel;
import com.sophos.logic.WebDriverConfig;

public class TestCases {
	
	WebDriverConfig driver;
	Excel excel;
	List<String> values;
	String xpath = "//div[@id='topstuff']//*";
	
	@Before
	public void setUp() throws Exception {
		driver= new WebDriverConfig();
		excel= new Excel();
	}

	@After
	public void tearDown() throws Exception {
		driver.close();
	}

	
	@Test
	public void allResult() {
		values = new ArrayList<String>();
		for(Row r : excel.getMySheet()) {
			if(r.getCell(0)!=null) {
				values.add(r.getCell(0).getStringCellValue());
			}
		}
	    WebDriverWait wait = new WebDriverWait(driver.getDriver(), 20);
	for(int i=0; i < values.size(); i++) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("q")));
    	driver.getDriver().findElement(By.name("q")).clear();
    	driver.getDriver().findElement(By.name("q")).sendKeys(values.get(i));
    	driver.getDriver().findElement(By.name("q")).submit();
    	driver.waitForLoad();
    	List <WebElement> childs = driver.getDriver().findElements(By.xpath(xpath));
    	int numofChildren = childs.size();
    	Boolean isPresent = numofChildren==0;
    	System.out.println(numofChildren);
    	excel.getRow(i).createCell(1).setCellValue(isPresent);
    	assertEquals(isPresent, true);
	}
	   
	    
	}
	
	@Test
	public  void atLeastOne() {
		values = new ArrayList<String>();
	    WebDriverWait wait = new WebDriverWait(driver.getDriver(), 20);
	    int count=0;
		for(Row r : excel.getMySheet()) {
			if(r.getCell(0)!=null) {
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("q")));
		    	driver.getDriver().findElement(By.name("q")).clear();
		    	driver.getDriver().findElement(By.name("q")).sendKeys(r.getCell(0).getStringCellValue());
		    	driver.getDriver().findElement(By.name("q")).submit();
		    	driver.waitForLoad();
		    	List <WebElement> childs = driver.getDriver().findElements(By.xpath(xpath));
		    	int numofChildren = childs.size();
		    	Boolean isPresent = numofChildren==0;
		    	if(isPresent) count++;
		    	System.out.println(numofChildren);
		    	excel.getRow(r.getRowNum()).createCell(1).setCellValue(isPresent);
			}
		}
	assertTrue(count>0);
	}
	
	@Test 
	public void writeExcel() {
		values = new ArrayList<String>();
	    WebDriverWait wait = new WebDriverWait(driver.getDriver(), 20);
		for(Row r : excel.getMySheet()) {
			if(r.getCell(0)!=null) {
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("q")));
		    	driver.getDriver().findElement(By.name("q")).clear();
		    	driver.getDriver().findElement(By.name("q")).sendKeys(r.getCell(0).getStringCellValue());
		    	driver.getDriver().findElement(By.name("q")).submit();
		    	driver.waitForLoad();
		    	List <WebElement> childs = driver.getDriver().findElements(By.xpath(xpath));
		    	int numofChildren = childs.size();
		    	Boolean isPresent = numofChildren==0;
		    	System.out.println(numofChildren);
		    	excel.getRow(r.getRowNum()).createCell(1).setCellValue(isPresent);
			}
		}

		excel.closeInputSt();
	    excel.writeExcel();
	    assertTrue(true);
	}

}
