package co.com.linio;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverConfig {
	private WebDriver driver;
	


public WebDriverConfig(String url) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\SEMILLERO09\\Downloads\\chromedriver_win32\\chromedriver.exe");
	driver= new ChromeDriver();
	driver.get(url);
}

public WebDriver getDriver() {
	return driver;
}

public void waitForLoad() {
    new WebDriverWait(driver, 30).until((ExpectedCondition<Boolean>) wd ->
    ((JavascriptExecutor) wd).executeScript("return document.readyState").equals("complete"));
}


public void close() {
	driver.close();
}
}
