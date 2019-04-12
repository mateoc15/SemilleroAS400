package com.bing.qa.serenitybing.steps;

import com.bing.qa.serenitybing.pages.BingHomePage;

import net.thucydides.core.annotations.Step;

public class EndUserSteps {

	BingHomePage pageBing;

	@Step
    public void escribirEnCampoDeBusqueda(String busqueda) {
       pageBing.escribirBusqueda(busqueda);
    }
	
	@Step
	public void darClickEnBotonDeBusqueda() {
		pageBing.clickEnBuscar();
	}
	
	@Step
	public void abrirPagina() {
		pageBing.open();
	}
	

	
	
}
