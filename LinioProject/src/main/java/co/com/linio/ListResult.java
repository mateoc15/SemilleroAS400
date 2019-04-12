package co.com.linio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ListResult {
final By element = By.xpath("//a[@title='Zapatos Oxford Para Hombre Outfit Italia Azul']//div[@class='detail-container']");
WebDriver driver;
	public ListResult(WebDriverConfig driver) {
		this.driver= driver.getDriver();
	}
	
	public void selectResult() {
		driver.findElement(element);
	}

}
