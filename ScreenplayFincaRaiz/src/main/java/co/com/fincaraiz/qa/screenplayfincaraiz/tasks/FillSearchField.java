package co.com.fincaraiz.qa.screenplayfincaraiz.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.fincaraiz.qa.screenplayfincaraiz.models.SearchModel;
import co.com.fincaraiz.qa.screenplayfincaraiz.util.Highlight;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import org.openqa.selenium.WebDriver;


import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static co.com.fincaraiz.qa.screenplayfincaraiz.userinterfaces.FincaRaizHomePage.LOCATION_SEARCH;
import static co.com.fincaraiz.qa.screenplayfincaraiz.userinterfaces.FincaRaizHomePage.CATEGORY_ITEM;
import static co.com.fincaraiz.qa.screenplayfincaraiz.userinterfaces.FincaRaizHomePage.CATEGORIES_CONTAINER;
import static co.com.fincaraiz.qa.screenplayfincaraiz.userinterfaces.FincaRaizHomePage.CONTAINER_TRANSACTION;
import static co.com.fincaraiz.qa.screenplayfincaraiz.userinterfaces.FincaRaizHomePage.TRANSACTION_TYPE;
import static co.com.fincaraiz.qa.screenplayfincaraiz.userinterfaces.FincaRaizHomePage.BUTTON_SEARCH;

public class FillSearchField implements Task{
	SearchModel search;
	WebDriver driver;
	public FillSearchField(SearchModel search, WebDriver driver) {
		this.search = search;
		this.driver = driver;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {

		actor.attemptsTo(
				
				WaitUntil.the(CATEGORIES_CONTAINER, isClickable()),
				Highlight.the(CATEGORIES_CONTAINER, driver),
				Click.on(CATEGORIES_CONTAINER),
				Highlight.transparent(CATEGORIES_CONTAINER, driver),
				
				Highlight.the(CATEGORY_ITEM.of(search.getCategoria()), driver),
				Click.on(CATEGORY_ITEM.of(search.getCategoria())),
				Highlight.transparent(CATEGORY_ITEM.of(search.getCategoria()), driver),
				
				Highlight.the(CATEGORIES_CONTAINER, driver),
				Click.on(CATEGORIES_CONTAINER),
				Highlight.transparent(CATEGORIES_CONTAINER, driver),
				
				WaitUntil.the(CONTAINER_TRANSACTION, isClickable()),
				Highlight.the(CONTAINER_TRANSACTION, driver),
				Click.on(CONTAINER_TRANSACTION),
				Click.on(CONTAINER_TRANSACTION),
				Highlight.transparent(CONTAINER_TRANSACTION, driver),

				Highlight.the(TRANSACTION_TYPE.of(search.getTransaccion()), driver),
				Click.on(TRANSACTION_TYPE.of(search.getTransaccion())),
				Highlight.transparent(TRANSACTION_TYPE.of(search.getTransaccion()), driver),

				Highlight.the(LOCATION_SEARCH, driver),
				Enter.keyValues(search.getUbicacion()).into(LOCATION_SEARCH),
				Highlight.transparent(LOCATION_SEARCH, driver),
				
				Highlight.the(BUTTON_SEARCH, driver),
				Click.on(BUTTON_SEARCH)
				);
	}
	
	

	public static FillSearchField withValues(SearchModel searchModel, WebDriver driver) {
		return instrumented(FillSearchField.class, searchModel, driver);
	}

}
