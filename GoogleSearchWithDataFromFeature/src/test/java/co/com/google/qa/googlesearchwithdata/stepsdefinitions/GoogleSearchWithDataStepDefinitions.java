package co.com.google.qa.googlesearchwithdata.stepsdefinitions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import co.com.google.pom.HomeGooglePom;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GoogleSearchWithDataStepDefinitions {

	public GoogleSearchWithDataStepDefinitions() {
		// TODO Auto-generated constructor stub
	}

	WebDriverConfig driver;
	private HomeGooglePom searchGooglePom;
	By campoBusqueda = By.xpath("//input[@title='Buscar']");
	By botonBuscar = By.xpath("//div[@class='FPdoLc VlcLAe']//input[@value='Buscar con Google']");
	Scenario scenario;

	@Before("@selenium")
	public void lbsr(Scenario scenario) {
		this.scenario = scenario;
	}

	@Given("arthur esta en el sitio de google")
	public void arthurEstaEnElSitioDeGoogle() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Arthur abre su navegador");
		driver = new WebDriverConfig("http://www.google.com.co");
		searchGooglePom = new HomeGooglePom(driver.getDriver());
		driver.getDriver().manage().window().maximize();
		System.out.println("Arthur abre la pagina de inicio google");
	}

	@When("cuando el busca la frase {string} compuesta {string}")
	public void cuandoElBuscaLaFraseCompuesta(String string, String string2) {
		System.out.println("En la barra de busqueda Arthur escribe una palabra");
		searchGooglePom.escribirTextoABuscar(string+string2);

		System.out.println("Arthur da click en el boton buscar");
		searchGooglePom.clickEnBuscar(botonBuscar);
	}
	

	@Then("El verifica que la palabra {string} este en los resultado")
	public void elVerificaQueLaPalabraEsteEnLosResultado(String string) {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("el actor capruta los resultados de la busqueda");
		System.out.println("el actor verifica que la busqueda es exitosa");
		// scenario.embed(searchGooglePom.adjuntarScreenshot(), "image/png");;
		assertTrue(driver.getDriver().getTitle().contains(string));

	}
	
	@After
	public void endTest(Scenario scenario) {
		scenario.embed(((TakesScreenshot)driver.getDriver()).getScreenshotAs(OutputType.BYTES), "image/png");
		driver.getDriver().quit(); 
	}

}
