package co.com.fincaraiz.qa.screenplayfincaraiz.userinterfaces;


import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.fincaraiz.com.co/")
public class FincaRaizHomePage extends PageObject {

	 public static final Target BOX_FILTERING = Target.the("box filtering")
			 .locatedBy("//div[@id='caja_busqueda']//li");
	 
	 public static final Target CATEGORIES_CONTAINER = Target.the("categories container")
			 .locatedBy("//div[@id='divContainerCategories']");
	 
	 /*public static final Target CATEGORY_ITEM = Target.the("category item")
			 .locatedBy("//ul[(@id='ddlCategoriesVivienda' or @id='ddlCategoriesComerciales') and not(contains(@style,'display: none;'))]//li[@onclick = 'SelectCategoryItem(this);' and not(contains(@style,'display: none;'))]");
	 */
	 
	 public static final Target CATEGORY_ITEM = Target.the("category item")
			 .locatedBy("//label[text()='{0}']");
	 
	 
	 
	 public static final Target CONTAINER_TRANSACTION = Target.the("container transaction")
			 .locatedBy("//div[@id='divContainerTransaction']");
	 /*public static final Target TRANSACTION_TYPE = Target.the("transaction type")
			 .locatedBy("//ul[@id='ddlTransactionType']//li[not(contains(@style,'display: none;'))]");*/
	 public static final Target TRANSACTION_TYPE = Target.the("transaction type")
			 .locatedBy("//li[text()='{0}']");
	 
	 
	 public static final Target LOCATION_SEARCH = Target.the("location search")
			 .locatedBy("//input[@id='txtWord']"); 
	 
	 public static final Target BUTTON_SEARCH = Target.the("Button")
			 .located(By.id("btnSearchAdvert"));

	
}