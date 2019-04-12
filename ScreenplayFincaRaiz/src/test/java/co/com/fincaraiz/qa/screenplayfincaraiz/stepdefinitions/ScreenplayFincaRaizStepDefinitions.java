package co.com.fincaraiz.qa.screenplayfincaraiz.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static co.com.fincaraiz.qa.screenplayfincaraiz.util.Utilites.check;
import static org.hamcrest.core.Is.is;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebDriver;

import co.com.fincaraiz.qa.screenplayfincaraiz.exceptions.NoInterenetConnection;
import co.com.fincaraiz.qa.screenplayfincaraiz.exceptions.SearchWithNoResult;
import co.com.fincaraiz.qa.screenplayfincaraiz.models.SearchModel;
import co.com.fincaraiz.qa.screenplayfincaraiz.questions.Internet;
import co.com.fincaraiz.qa.screenplayfincaraiz.questions.ListResult;
import co.com.fincaraiz.qa.screenplayfincaraiz.questions.PropertyDetails;
import co.com.fincaraiz.qa.screenplayfincaraiz.tasks.FillSearchField;
import co.com.fincaraiz.qa.screenplayfincaraiz.tasks.SelectResult;
import co.com.fincaraiz.qa.screenplayfincaraiz.userinterfaces.FincaRaizHomePage;
import co.com.fincaraiz.qa.screenplayfincaraiz.util.Utilites;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;

public class ScreenplayFincaRaizStepDefinitions {
	
	public  static final int USUARIO_EN_ESCENA = 0;
	@Managed(driver="chrome")
	WebDriver hisBrowser; 
	
	private Actor user = Actor.named("Mateo");
	
	FincaRaizHomePage fincaRaizHomePage;
	@Before 
	public void setup() throws IOException {
		user.can(BrowseTheWeb.with(hisBrowser));
		if(!Utilites.check()) {
			user.should(seeThat(Internet.isInternetConnection(), is(true)).orComplainWith(NoInterenetConnection.class, NoInterenetConnection.NO_INTERNET_CONNECTION));
		}

	}

	
	
	@Given("^User is in the fincaraiz home page$")
	public void heIsInTheFincaraizHomePage() throws Exception {
		user.wasAbleTo(Open.browserOn(fincaRaizHomePage));
	}

	@When("^He selects the search options$")
	public void heSelectTheSearchOptions(List<SearchModel> searchModel) throws Exception {
		user.attemptsTo(FillSearchField.withValues(searchModel.get(USUARIO_EN_ESCENA), hisBrowser));
	}
	
	

	@Then("^He must see that the search return results$")
	public void heMustSeeThatTheSearchReturnResults() throws Exception {
		//user.should(seeThat(PropertyDetails.matchWithData(searchModel.get(USUARIO_EN_ESCENA)), is(searchModel.get(USUARIO_EN_ESCENA).getCategoria()+" en "+searchModel.get(USUARIO_EN_ESCENA).getTransaccion()))); 
		//user.should(seeThat(PropertyDetails.matchWithData(searchModel.get(USUARIO_EN_ESCENA)), is(true)));
		user.should(seeThat(ListResult.returnedResults(), is(true)).orComplainWith(SearchWithNoResult.class, SearchWithNoResult.EMPTY_SEARCH));
	}
	
	
	


}
