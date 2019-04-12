package co.com.google.qa.miprimerserenity.stepdefinitions;

import co.com.google.qa.miprimerserenity.steps.EndUserSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class BusquedaEnGoogleStepDefinitions {
	
	@Steps
	EndUserSteps user;

	@Given("^arthur esta en el sitio de google$")
	public void arthurEstaEnElSitioDeGoogle() throws Exception {
		user.is_the_home_page();
	}

	@When("^cuando el busca la frase \"([^\"]*)\" compuesta \"([^\"]*)\"$")
	public void cuandoElBuscaLaFraseCompuesta(String arg1, String arg2) throws Exception {
	    user.looks_for(arg1 + " " + arg2);
	}

	@Then("^El verifica que la palabra \"([^\"]*)\" este en los resultado$")
	public void elVerificaQueLaPalabraEsteEnLosResultado(String arg1) throws Exception {

	}

}
