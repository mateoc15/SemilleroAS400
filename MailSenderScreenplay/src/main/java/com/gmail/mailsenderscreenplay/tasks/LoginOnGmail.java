package com.gmail.mailsenderscreenplay.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import org.openqa.selenium.support.ui.Wait;

import com.gmail.mailsenderscreenplay.models.Credentials;
import static com.gmail.mailsenderscreenplay.userinterfaces.GmailLoginPage.EMAIL_FIELD;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.locators.WaitForWebElementCollection;

public class LoginOnGmail implements Task {
	private Credentials credentials;

	public LoginOnGmail(String user, String pass) {
		this.credentials.setUser(user);
		this.credentials.setPass(pass);
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				
				Enter.theValue(credentials.getUser()).into(EMAIL_FIELD)
				);

	}

	public static LoginOnGmail withCredentials(String usuario, String pass) {
		return instrumented(LoginOnGmail.class, usuario, pass);
	}

}
