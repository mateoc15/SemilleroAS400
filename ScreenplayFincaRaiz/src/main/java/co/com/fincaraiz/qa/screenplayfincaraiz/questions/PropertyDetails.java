package co.com.fincaraiz.qa.screenplayfincaraiz.questions;

import co.com.fincaraiz.qa.screenplayfincaraiz.models.SearchModel;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;

import static co.com.fincaraiz.qa.screenplayfincaraiz.userinterfaces.PropertyDetailPage.CATEGORY_TRANSACTION;
import static co.com.fincaraiz.qa.screenplayfincaraiz.util.Highlight.highlightElement;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.WebDriver;

@Subject("validar resultado")
public class PropertyDetails implements Question<Boolean>{
	SearchModel search;
	WebDriver driver;

	public PropertyDetails(SearchModel search, WebDriver driver) {
		this.search=search;
		this.driver=driver;
	}
	
	@Override
	public Boolean answeredBy(Actor actor) {
		highlightElement(driver, CATEGORY_TRANSACTION.resolveFor(actor));
		String textToCompare = CATEGORY_TRANSACTION.resolveFor(actor).getText();
		String textToCompare2 = search.getCategoria()+" en "+search.getTransaccion();
		String[] parts = textToCompare.split("\n");
		String ubicacion =StringUtils.stripAccents(parts[1]);
		return parts[0].equals(textToCompare2) && ubicacion.contains(search.getUbicacion());
	}
	
	public static PropertyDetails matchWithData(SearchModel search, WebDriver driver) {
		return new PropertyDetails(search, driver);
	}

	

}