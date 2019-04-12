package com.bing.qa.serenitybing.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.bing.com")
public class BingHomePage extends PageObject{
	@FindBy(name="q")
	private WebElementFacade searchTerm;

	@FindBy(name="go")
	public WebElementFacade searchButton;
	
	
	public void escribirBusqueda(String textoABuscar) {
		searchTerm.waitUntilVisible().sendKeys(textoABuscar);
	}
	
	public void clickEnBuscar() {
		searchButton.waitUntilClickable().click();
	}
	

}
