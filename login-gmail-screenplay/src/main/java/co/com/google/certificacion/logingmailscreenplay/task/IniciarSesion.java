package co.com.google.certificacion.logingmailscreenplay.task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import org.openqa.selenium.Keys;

import co.com.google.certificacion.logingmailscreenplay.models.Credenciales;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import static co.com.google.certificacion.logingmailscreenplay.userinterfaces.GmailHomePage.USER_TXT;
import static co.com.google.certificacion.logingmailscreenplay.userinterfaces.GmailHomePage.PASSWORD_TXT;


public class IniciarSesion implements Task {
	
	private String usuario;
	private String contrase�a;
	
	public IniciarSesion(String usuario, String contrase�a) {
		this.usuario=usuario;
		this.contrase�a=contrase�a;
	}
	

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Enter.theValue(usuario).into(USER_TXT).thenHit(Keys.ENTER),
				Enter.theValue(contrase�a).into(PASSWORD_TXT).thenHit(Keys.ENTER)
								);
		
		
	}

	public static IniciarSesion conLasCredenciales(Credenciales credenciales) {
		// TODO Auto-generated method stub
	return instrumented(IniciarSesion.class, credenciales.getUser(), credenciales.getPassword());
	}
	
	

}
