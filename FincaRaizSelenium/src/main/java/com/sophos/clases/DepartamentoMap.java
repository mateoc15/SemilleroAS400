package com.sophos.clases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DepartamentoMap {
	final String XMAP = "//map[@id='Map']//area[not(contains(@show,'false'))]";

	WebDriverConfig driver; 
	List <WebElement> childs;
	int randomSelector;
	

	public DepartamentoMap(WebDriverConfig driver) {
		this.driver = driver;
	}
	
	public SearchModel checkPage(SearchModel search) {
		driver.waitForLoad();
		if(driver.getDriver().getTitle().contains("Búsqueda por mapa")) {
			childs= driver.getDriver().findElements(By.xpath(XMAP));
			randomSelector=(int) Math.floor(Math.random()*childs.size());
			if(childs.get(randomSelector).getAttribute("level").equals("1")) {
				System.out.println("Ciudad: "+ childs.get(randomSelector).getAttribute("name"));
				search.setCiudad(childs.get(randomSelector).getAttribute("name"));
			}else {
				System.out.println("Sector: "+ childs.get(randomSelector).getAttribute("name"));
				search.setSector(childs.get(randomSelector).getAttribute("name"));
			}
			childs.get(randomSelector).click();
			return search;
		}else {
			System.out.println("no se abrio mapa");
			return search;
		}
		
		
	}
}
