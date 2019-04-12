package co.com.fincaraiz.qa.screenplayfincaraiz.util;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import co.com.fincaraiz.qa.screenplayfincaraiz.interactions.HighLightElement;
import co.com.fincaraiz.qa.screenplayfincaraiz.interactions.UnHighLightElement;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;

/**
 * @author SEMILLERO09
 *
 */
public class Highlight {

	WebDriver driver;

	public Highlight(WebDriver driver) {
		super();
		this.driver = driver;
	}

	/**Método estatico que retorna una interacción para encerrar un target en un borde rojo 
	 * @param target
	 * @param driver
	 * @return 
	 */
	public static Interaction the(Target target, WebDriver driver) {
		return instrumented(HighLightElement.class, target, driver);
	}

	/**Método estatico que retorna una interacción para encerrar un WebElementFacade en un borde rojo 
	 * @param webElementFacade
	 * @param driver
	 * @return
	 */
	public static Interaction the(WebElementFacade webElementFacade, WebDriver driver) {
		return instrumented(HighLightElement.class, webElementFacade, driver);
	}

	
	/**Método estatico que retorna una interacción para limpiar el borde de un Target 
	 * @param target
	 * @param driver
	 * @return
	 */
	public static Interaction transparent(Target target, WebDriver driver) {
		return instrumented(UnHighLightElement.class, target, driver);
	}

	/**Método estatico que encierra un WebElementFacade en un borde rojo 
	 * @param driver
	 * @param element
	 */
	public static void highlightElement(WebDriver driver, WebElementFacade element) {
		if (driver instanceof JavascriptExecutor) {
			((JavascriptExecutor) driver).executeScript("arguments[0].style.border='3px solid blue'", element);
		}
	}

	/**Método estatico que limpia el borde de un WebElementFacade
	 * @param driver
	 * @param element
	 */
	public static void transparentHighlight(WebDriver driver, WebElementFacade element) {
		if (driver instanceof JavascriptExecutor) {
			((JavascriptExecutor) driver).executeScript("arguments[0].style.border='3px solid transparent'", element);
		}
	}
}
