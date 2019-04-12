package co.com.fincaraiz.qa.screenplayfincaraiz.interactions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Step;

public class UnHighLightElement implements Interaction{
    private final Target target;
    WebDriver driver;
	
	
    public UnHighLightElement(Target target, WebDriver driver) {
        this.target = target;
        this.driver = driver;
	}
	
    @Step("Unhighlight an element")
    public <T extends Actor> void performAs(T theUser) {
    	((JavascriptExecutor) driver).executeScript("arguments[0].style.border='3px solid transparent'", target.resolveFor(theUser));
    }


}