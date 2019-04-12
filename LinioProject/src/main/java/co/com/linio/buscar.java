package co.com.linio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class buscar {
WebDriver driver;
final By campoBusqueda = By.name("q");
	
	public buscar(WebDriverConfig driver) {
		this.driver = driver.getDriver();
	}
	

	public void writeSearch(String search) {
		driver.findElement(campoBusqueda).sendKeys(search);
	}
	public void submitSearch() {
		driver.findElement(campoBusqueda).submit();		
	}
}
