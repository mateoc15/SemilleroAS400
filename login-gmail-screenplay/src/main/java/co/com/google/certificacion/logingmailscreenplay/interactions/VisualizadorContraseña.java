package co.com.google.certificacion.logingmailscreenplay.interactions;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import static co.com.google.certificacion.logingmailscreenplay.userinterfaces.GmailHomePage.VIEW_PASS;

import co.com.google.certificacion.logingmailscreenplay.task.IniciarSesion;
import co.com.google.certificacion.logingmailscreenplay.userinterfaces.GmailHomePage;

import static co.com.google.certificacion.logingmailscreenplay.userinterfaces.GmailHomePage.BOTON_SIGUIENTE;;
public class VisualizadorContraseña  implements Interaction{

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		//GmailHomePage.VIEW_PASS.resolveFor(actor).click();
		//GmailHomePage.BOTON_SIGUIENTE.resolveFor(actor).click();
		
		actor.attemptsTo(
				Click.on(VIEW_PASS),
				Click.on(BOTON_SIGUIENTE)
				);
		
	}
public static VisualizadorContraseña verContraseñaYPresionandoSiguiente() {
	return instrumented(VisualizadorContraseña.class);
}
	
	

}
