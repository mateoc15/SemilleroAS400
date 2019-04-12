package co.com.google.certificacion.logingmailscreenplay.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.gmail.com")
public class GmailHomePage extends PageObject {
	
	  public static final Target USER_TXT = Target.the("campo usuario")    		
	            .located(By.name("identifier"));
	  
	  
	  public static final Target PASSWORD_TXT = Target.the("campo contrase�a")    		
	            .located(By.name("password"));
	
	  
	  public static final Target VIEW_PASS = Target.the("Ver contrase�a")    		
			  .locatedBy("//span[@class='nK6IJ iStiSd']//*[@class='VhKI7c']");

	  public static final Target BOTON_SIGUIENTE = Target.the("Boton siguiente")    		
			  .locatedBy("//span[contains(text(),'Siguiente')]");
	  

}
