package com.sophos.clases;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebElement;


public class HomePage {
	final String XCAJABUSQUEDA = "//div[@id='caja_busqueda']//li";
	final String XCUSTOMCAJABUSQUEDA = "//ul[@id='filtershome']//li//a[contains(text(),'";
	
	final String XCONTAINERCATEGORIES = "//div[@id='divContainerCategories']";
	final String XCATEGORYITEM = "//ul[(@id='ddlCategoriesVivienda' or @id='ddlCategoriesComerciales') and not(contains(@style,'display: none;'))]//li[@onclick = 'SelectCategoryItem(this);' and not(contains(@style,'display: none;'))]";
	final String XCUSTOMCATEGORYITEM = "//label[contains(text(),'";
	
	final String XCONTAINERTRANSACTION = "//div[@id='divContainerTransaction']";
	final String XTRANSACTIONTYPE = "//ul[@id='ddlTransactionType']//li[not(contains(@style,'display: none;'))]";
	final String XCUSTOMTRANSACTIONTYPE = "//li[contains(text(),'";
	
	final String XSEARCHLOCATION = "//input[@id='txtWord']";
	
	final String XMAP = "//map[@id='Map']//area";
	WebDriverConfig driver;
	Highlight hl = new Highlight();

	
	public HomePage(WebDriverConfig driver) {
		this.driver = driver;
	}
	
	
	public SearchModel randomSearch() {
		SearchModel search = new SearchModel();

		int randomSelector;
		List <WebElement> childs;
		//Se elige aleatoriamente si proyecto nuevo, vivienda o inmueble comercial y se elige
		driver.waitForLoad();
		childs= driver.getDriver().findElements(By.xpath(XCAJABUSQUEDA));
		randomSelector=(int) Math.floor(Math.random()*childs.size());
		search.setTipo(childs.get(randomSelector).getText());
		System.out.println("Tipo: "+ childs.get(randomSelector).getText());
		hl.highlightElement(driver.getDriver(), childs.get(randomSelector));
		childs.get(randomSelector).click();

		//Se elige aleatoriamente que categoria y se da click en el item 
		driver.getDriver().findElement(By.xpath(XCONTAINERCATEGORIES)).click();
		hl.highlightElement(driver.getDriver(), driver.getDriver().findElement(By.xpath(XCONTAINERCATEGORIES)));
		childs = driver.getDriver().findElements(By.xpath(XCATEGORYITEM));
		randomSelector=(int) Math.floor(Math.random()*childs.size());
		hl.highlightElement(driver.getDriver(), childs.get(randomSelector));
		childs.get(randomSelector).click();
		WebElement hijo1= childs.get(randomSelector);
		search.setCategoria(hijo1.getText());
		System.out.println("Tipo de categoría: "+ hijo1.getText());
		
		//se elige si en venta o en arriendo
		driver.getDriver().findElement(By.xpath(XCONTAINERTRANSACTION)).click();
		childs = driver.getDriver().findElements(By.xpath(XTRANSACTIONTYPE));
		System.out.println("el numero es: "+childs.size());
		randomSelector=(int) Math.floor(Math.random()*childs.size());
		try {
			childs.get(randomSelector).click();
			hijo1= childs.get(randomSelector);
			System.out.println("Tipo de transaccion: "+ childs.get(randomSelector).getText()+randomSelector);
			search.setTransaccion(hijo1.getText());
		}catch(ElementNotVisibleException env){
			System.out.println("Tipo de transacción: "+ driver.getDriver().findElement(By.xpath(XCONTAINERTRANSACTION)).getText());
			search.setTransaccion(driver.getDriver().findElement(By.xpath(XCONTAINERTRANSACTION)).getText());
		}
		
		//seleccionar del mapa
		childs= driver.getDriver().findElements(By.xpath(XMAP));
		randomSelector=(int) Math.floor(Math.random()*childs.size());
		System.out.println("Departamento: "+ childs.get(randomSelector).getAttribute("name"));
		search.setDepartamento(childs.get(randomSelector).getAttribute("name"));
		childs.get(randomSelector).click();
		return search;
	}
	
	
	public void customSearch(SearchModel search) {
		WebElement element;
		driver.waitForLoad();
		element= driver.getDriver().findElement(By.xpath(XCUSTOMCAJABUSQUEDA+search.getTipo()+"')]"));
		element.click();
		
		driver.getDriver().findElement(By.xpath(XCONTAINERCATEGORIES)).click();
		driver.getDriver().findElement(By.xpath(XCUSTOMCATEGORYITEM+search.getCategoria()+"')]")).click();
	
		driver.getDriver().findElement(By.xpath(XCONTAINERTRANSACTION)).click();
		driver.getDriver().findElement(By.xpath(XCUSTOMTRANSACTIONTYPE+search.getTransaccion()+"')]")).click();
	
		driver.getDriver().findElement(By.xpath(XSEARCHLOCATION)).sendKeys(search.getUbicacion());
		driver.getDriver().findElement(By.id("btnSearchAdvert")).click();
	}



	
	
}
