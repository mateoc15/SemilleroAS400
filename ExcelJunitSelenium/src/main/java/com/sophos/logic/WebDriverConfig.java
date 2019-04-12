package com.sophos.logic;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverConfig {
	static WebDriver driver;
	
	
public WebDriver getDriver() {
		return driver;
	}


public WebDriverConfig() {
	System.setProperty("webdriver.ie.driver", "C:\\Users\\SEMILLERO09\\Downloads\\IEDriverServer_Win32_3.9.0\\IEDriverServer.exe");
	driver= new InternetExplorerDriver();
	driver.get("http://www.google.com.uy");
}

public void waitForLoad() {
    new WebDriverWait(driver, 30).until((ExpectedCondition<Boolean>) wd ->
    ((JavascriptExecutor) wd).executeScript("return document.readyState").equals("complete"));
}


public void close() {
	driver.close();
}
}
