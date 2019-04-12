package co.com.fincaraiz.qa.screenplayfincaraiz.interactions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Step;

public class HighLightElement implements Interaction {
	private final WebElementFacade webElementFacade;
	private final Target target;
	WebDriver driver;

	public HighLightElement(WebElementFacade webElementFacade, WebDriver driver) {
		this.webElementFacade = webElementFacade;
		this.driver = driver;
		this.target = null;
	}

	public HighLightElement(Target target, WebDriver driver) {
		this.target = target;
		this.driver = driver;
		this.webElementFacade = null;
	}

	@Step("njn")
	public <T extends Actor> void performAs(T theUser) {


		if (target == null) {
			((JavascriptExecutor) driver).executeScript("arguments[0].style.border='5px solid red'", webElementFacade);
		} else {
			((JavascriptExecutor) driver).executeScript("arguments[0].style.border='5px solid red'", target.resolveFor(theUser));

		}

	}

}