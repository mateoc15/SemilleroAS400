package com.sophos.clases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ListResult {
	final String XRESULTDISPLAY= "//div[@id='AjaxNoAdverts' and not(contains(@style,'display: none'))]";
	final String XRESULTLIST = "//div[@id='divAdverts']//ul";
	WebDriverConfig driver;
public ListResult(WebDriverConfig driver) {
	this.driver=driver;
}

public boolean searchWithResults() {
	return driver.getDriver().findElements(By.xpath(XRESULTDISPLAY)).size()==0;
}

public void getFirstResult() {
	List <WebElement> elements;
	elements=driver.getDriver().findElements(By.xpath(XRESULTLIST));
	elements.get(0).findElement(By.className("media")).click();	
}

public void getRandomResult() {
	List <WebElement> elements;
	elements=driver.getDriver().findElements(By.xpath(XRESULTLIST));
	int random= (int) (Math.random()*elements.size());
	elements.get(random).findElement(By.className("media")).click();	
}

}
