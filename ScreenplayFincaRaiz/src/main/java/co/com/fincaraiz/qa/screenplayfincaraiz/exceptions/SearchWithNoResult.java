package co.com.fincaraiz.qa.screenplayfincaraiz.exceptions;

public class SearchWithNoResult extends AssertionError {
	public static final String EMPTY_SEARCH="La busqueda no retorn� resultados";
	
	public  SearchWithNoResult(String message, Throwable cause) {
		super(message, cause);
	}	
}


