package co.com.fincaraiz.qa.screenplayfincaraiz.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class ListResultPage extends PageObject{
	public static final Target LIST_RESULT = Target.the("result list")
			 .locatedBy("//ul[(contains(@id,'rowIndex_'))]");

	public static final Target NO_RESULTS = Target.the("No result message")
			.locatedBy("//div[@id='AjaxNoAdverts']");
}