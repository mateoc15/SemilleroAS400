package co.com.google.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilidadesdesarrollo.BasePage;



public class HomeGooglePom {
	private WebDriver driver;
	private By txtBuscar =  By.xpath("//input[@title='Buscar']");
	
	private BasePage basePage;

		public HomeGooglePom(WebDriver driver) {
			this.driver=driver;
			basePage = new BasePage(driver);
		}

		public void escribirTextoABuscar(String text) {
			basePage.writeText(txtBuscar, text);
		}
		
		public void clickEnBuscar(By elementBy) {
			basePage.click(elementBy);
		}
		
		public byte[] adjuntarScreenshot() throws Exception {
			return basePage.attachEvidence();
		}

}
