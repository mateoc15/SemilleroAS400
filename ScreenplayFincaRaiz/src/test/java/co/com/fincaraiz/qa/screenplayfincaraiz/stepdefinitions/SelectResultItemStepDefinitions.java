package co.com.fincaraiz.qa.screenplayfincaraiz.stepdefinitions;

import java.util.List;

import org.openqa.selenium.WebDriver;

import co.com.fincaraiz.qa.screenplayfincaraiz.exceptions.ResultNotMatch;
import co.com.fincaraiz.qa.screenplayfincaraiz.exceptions.SearchWithNoResult;
import co.com.fincaraiz.qa.screenplayfincaraiz.models.SearchModel;
import co.com.fincaraiz.qa.screenplayfincaraiz.questions.PropertyDetails;
import co.com.fincaraiz.qa.screenplayfincaraiz.tasks.FillSearchField;
import co.com.fincaraiz.qa.screenplayfincaraiz.tasks.SelectResult;
import co.com.fincaraiz.qa.screenplayfincaraiz.userinterfaces.FincaRaizHomePage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import static org.hamcrest.core.Is.is;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;



public class SelectResultItemStepDefinitions {
	
	public  static final int USUARIO_EN_ESCENA = 0;
	@Managed(driver="chrome")
	WebDriver hisBrowser; 
	
	private Actor user = Actor.named("User");
	
	FincaRaizHomePage fincaRaizHomePage;
	
	@Before 
	public void setup() {
		user.can(BrowseTheWeb. with(hisBrowser)); 
	}
	
	@Given("^User is in the page result of the search$")
	public void thePageReturnedTheResultOfTheSearch() throws Exception {

	}

	@When("^He clicks on a random result$")
	public void heClicksOnARandomResult() throws Exception {
		user.attemptsTo(SelectResult.getRandomResult(hisBrowser));
	}

	@Then("^He checks the result matches with the search$")
	public void heChecksTheResultMatchesWithTheSearch(List<SearchModel> searchModel) throws Exception {
		user.should(seeThat(PropertyDetails.matchWithData(searchModel.get(USUARIO_EN_ESCENA), hisBrowser), is(true)).orComplainWith(ResultNotMatch.class, ResultNotMatch.RESULT_NOT_MATCH_MESSAGE));
	}
}