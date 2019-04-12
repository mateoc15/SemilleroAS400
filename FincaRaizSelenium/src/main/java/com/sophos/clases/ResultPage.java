package com.sophos.clases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ResultPage {
	private WebDriverConfig driver;

public ResultPage(WebDriverConfig driver) {
	this.driver = driver;
}
	public boolean checkMatch(SearchModel search) {
		String xpath= "//h1[contains(text(),'"+search.getCategoria()+"')]";
		WebElement element1= driver.getDriver().findElement(By.xpath(xpath));
		if(element1.getText().contains(search.getCategoria()) && element1.getText().contains(search.getTransaccion())&&element1.getText().contains(search.getUbicacion())) {
			System.out.println(element1.getText());
			return true;
		}else {
			return false;
		}
		
	}
}
