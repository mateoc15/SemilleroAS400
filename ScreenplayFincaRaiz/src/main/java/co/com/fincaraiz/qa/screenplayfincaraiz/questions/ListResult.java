package co.com.fincaraiz.qa.screenplayfincaraiz.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import static co.com.fincaraiz.qa.screenplayfincaraiz.userinterfaces.ListResultPage.NO_RESULTS;

public class ListResult implements Question<Boolean>{

	public ListResult() {
	}
	
	@Override
	public Boolean answeredBy(Actor actor) {
		return !NO_RESULTS.resolveFor(actor).isVisible();
	}

	public static ListResult returnedResults() {
		return new ListResult();
	}
	
	

}