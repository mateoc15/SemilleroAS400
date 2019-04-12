package co.com.google.qa.busquedagoogle.stepdefinitions;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.ScreenshotException;

import co.com.google.pom.HomeGooglePom;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BusquedaGoogleStepDefinitions {

	public BusquedaGoogleStepDefinitions() {
		

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
	
	@Given("Arthur am on google home page")
	public void arthur_am_on_google_home_page() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Arthur abre su navegador");
		driver = new WebDriverConfig("http://www.google.com.co");
		searchGooglePom = new HomeGooglePom(driver.getDriver());
		driver.getDriver().manage().window().maximize();
		System.out.println("Arthur abre la pagina de inicio google");
	}

	@When("He does the search")
	public void he_does_the_search() {
		System.out.println("En la barra de busqueda Arthur escribe una palabra");
		searchGooglePom.escribirTextoABuscar("cucumber java serenity");
		
		System.out.println("Arthur da click en el boton buscar");
		searchGooglePom.clickEnBuscar(botonBuscar);;
	}

	@Then("He validates that the result is success")
	public void he_validates_that_the_result_is_success()  {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("el actor capruta los resultados de la busqueda");
		System.out.println("el actor verifica que la busqueda es exitosa");
		//scenario.embed(searchGooglePom.adjuntarScreenshot(), "image/png");;
		assertEquals("cucumber java serenity - Buscar con Google", driver.getDriver().getTitle());
		
	}
	
	@After
	public void endTest(Scenario scenario) {
		scenario.embed(((TakesScreenshot)driver.getDriver()).getScreenshotAs(OutputType.BYTES), "image/png");
		driver.getDriver().quit(); 
	}
	
}
