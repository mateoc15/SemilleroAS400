package co.com.fincaraiz.qa.screenplayfincaraiz.questions;

import java.io.IOException;

import co.com.fincaraiz.qa.screenplayfincaraiz.util.Utilites;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class Internet implements Question<Boolean> {

	@Override
	public Boolean answeredBy(Actor actor) {
		// TODO Auto-generated method stub
		try {
			return Utilites.check();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public static Internet isInternetConnection() {
		return new Internet();
	}

}
