package com.gmail.qa.mailsenderscreenplay.stepdefinitions;

import org.openqa.selenium.WebDriver;

import com.gmail.mailsenderscreenplay.tasks.LoginOnGmail;
import com.gmail.mailsenderscreenplay.userinterfaces.GmailLoginPage;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;

public class LoginStepDefinitions {

	@Managed(driver="chrome")
	WebDriver driver;
	
	private GmailLoginPage gmailLoginPage;
	private Actor mateo = Actor.named("Mateo");
	
	@Before
	public void setUp() {
		mateo.can(BrowseTheWeb.with(driver));

	}
	
	
	@Given("^we visit the gmail plogin page$")
	public void weVisitTheGmailPloginPage() throws Exception {
		mateo.wasAbleTo(Open.browserOn().the(gmailLoginPage));
	}

	@When("^we put the credentials \"([^\"]*)\" and \"([^\"]*)\"$")
	public void wePutTheCredentialsAnd(String arg1, String arg2) throws Exception {
		mateo.attemptsTo(LoginOnGmail.withCredentials(arg1, arg2));
	     
	}

	@Then("^we click and we reach the home page with the list of received mails\\.$")
	public void weClickAndWeReachTheHomePageWithTheListOfReceivedMails() throws Exception {
	     
	}
}
