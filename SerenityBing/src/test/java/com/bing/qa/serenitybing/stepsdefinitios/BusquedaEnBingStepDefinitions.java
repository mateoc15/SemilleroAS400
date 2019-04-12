package com.bing.qa.serenitybing.stepsdefinitios;

import static org.junit.Assert.assertEquals;

import com.bing.qa.serenitybing.steps.EndUserSteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class BusquedaEnBingStepDefinitions {
	
	@Steps
	EndUserSteps mateo;
	
	@Given("^Mateo esta en el sitio web Bing$")
	public void mateoEstaEnElSitioWebBing() throws Exception {
	    mateo.abrirPagina();
	}

	@When("^Busca la frase compuesta por \"([^\"]*)\" y \"([^\"]*)\"$")
	public void buscaLaFraseCompuestaPorY(String arg1, String arg2) throws Exception {
		mateo.escribirEnCampoDeBusqueda(arg1 + " " + arg2);
		mateo.darClickEnBotonDeBusqueda();
	}

	@Then("^Verifica que la palabra \"([^\"]*)\" este en la lista de resultados$")
	public void verificaQueLaPalabraEsteEnLaListaDeResultados(String arg1) throws Exception {

	}
	
}
