package Busqueda;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Busqueda {
	
	static String xpath = "//div[@id='topstuff']//*";

	public static void main(String[] args) {
		Conexion con = new Conexion();
		Connection cn = null;
		Statement stm = null;
		ResultSet rs = null;
		WebDriver driver = null;
		
		try {
			cn = con.conectarDB();
			stm=cn.createStatement();
			rs = stm.executeQuery("SELECT * FROM mysqldb.`data_table`");
			driver = iniciarSelenium();
			driver.get("http://www.google.com.uy");
			while(rs.next()) {
				Statement stm2 = cn.createStatement();
				stm2.executeUpdate("UPDATE mysqldb.`data_table` SET arroja_resultados ='"+checkResult(driver, rs)+"' where iddata_table="+rs.getString(1));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}	
	
	public static WebDriver iniciarSelenium() {
		System.setProperty("webdriver.ie.driver", "C:\\Users\\SEMILLERO09\\Downloads\\IEDriverServer_Win32_3.9.0\\IEDriverServer.exe");
		WebDriver driver= new InternetExplorerDriver();
		return driver;
	}
	
	static void  waitForLoad(WebDriver driver) {
	    new WebDriverWait(driver, 30).until((ExpectedCondition<Boolean>) wd ->
	    ((JavascriptExecutor) wd).executeScript("return document.readyState").equals("complete"));
	}
	
	static boolean checkResult(WebDriver driver, ResultSet rs ) {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("q")));
		driver.findElement(By.name("q")).clear();
    	try {
			driver.findElement(By.name("q")).sendKeys(rs.getString(2));
		} catch (SQLException e) {
			e.printStackTrace();
		}
    	driver.findElement(By.name("q")).submit();
    	waitForLoad(driver);
    	List <WebElement> childs = driver.findElements(By.xpath(xpath));
    	int numofChildren = childs.size();
    	return numofChildren==0;

	}
}





	
