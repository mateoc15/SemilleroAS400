package ScriptExplorer;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ScriptIE {

	private static Workbook myWorkbook;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.ie.driver", "C:\\Users\\SEMILLERO09\\Downloads\\IEDriverServer_Win32_3.9.0\\IEDriverServer.exe");
		WebDriver driver= new InternetExplorerDriver();
		driver.get("http://www.google.com.uy");
				
		
		File file = new File("C:\\Users\\SEMILLERO09\\Documents\\Busqueda.xlsx");
		FileInputStream inputStream = new FileInputStream(file);
			
		myWorkbook = new XSSFWorkbook(inputStream);
		Sheet mySheet = myWorkbook.getSheet("Hoja1");
		String xpath = "//div[@id='topstuff']//*";

	    int rowCount = mySheet.getLastRowNum()-mySheet.getFirstRowNum();
	    System.out.print(rowCount);
	    WebDriverWait wait = new WebDriverWait(driver, 20);
	    for (int i = 1; i < rowCount+1; i++) {
	    	Row row = mySheet.getRow(i);
	    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("q")));
	    	driver.findElement(By.name("q")).clear();
	    	driver.findElement(By.name("q")).sendKeys(row.getCell(0).getStringCellValue());
	    	driver.findElement(By.name("q")).submit();
	    	waitForLoad(driver);
	    	List <WebElement> childs = driver.findElements(By.xpath(xpath));
	    	int numofChildren = childs.size();
	    	Boolean isPresent = numofChildren==0;
	    	System.out.println(numofChildren);
	    	row.createCell(1).setCellValue(isPresent);
	    } 
	    inputStream.close();
	    FileOutputStream outputStream = new FileOutputStream(file);
	    myWorkbook.write(outputStream);
	    outputStream.close();

	}

	static void  waitForLoad(WebDriver driver) {
	    new WebDriverWait(driver, 30).until((ExpectedCondition<Boolean>) wd ->
	    ((JavascriptExecutor) wd).executeScript("return document.readyState").equals("complete"));
	}
}
