package co.com.fincaraiz.qa.screenplayfincaraiz.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class PropertyDetailPage extends PageObject{
	public static final Target CATEGORY_TRANSACTION = Target.the("Text of the category and transaction")
			 .locatedBy("//div[@class='box']//h1[contains(text(), 'en')]");
}
