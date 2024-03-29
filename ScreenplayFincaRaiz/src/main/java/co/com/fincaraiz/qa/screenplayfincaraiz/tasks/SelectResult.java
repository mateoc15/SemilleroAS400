package co.com.fincaraiz.qa.screenplayfincaraiz.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import org.openqa.selenium.WebDriver;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.fincaraiz.qa.screenplayfincaraiz.userinterfaces.ListResultPage.LIST_RESULT;
import static co.com.fincaraiz.qa.screenplayfincaraiz.util.Utilites.randomNumber;

import co.com.fincaraiz.qa.screenplayfincaraiz.util.Highlight;

public class SelectResult implements Task {
	WebDriver driver;

	public SelectResult(WebDriver driver) {
		this.driver = driver;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		int random = randomNumber(LIST_RESULT.resolveAllFor(actor).size());
		actor.attemptsTo(
				Highlight.the(LIST_RESULT.resolveAllFor(actor).get(random), driver),
				Click.on(LIST_RESULT.resolveAllFor(actor).get(random)));
	}

	public static SelectResult getRandomResult(WebDriver driver) {
		return instrumented(SelectResult.class, driver);
	}

}
