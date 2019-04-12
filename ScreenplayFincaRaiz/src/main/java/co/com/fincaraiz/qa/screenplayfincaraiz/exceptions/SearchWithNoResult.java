package co.com.fincaraiz.qa.screenplayfincaraiz.exceptions;

public class SearchWithNoResult extends AssertionError {
	public static final String EMPTY_SEARCH="La busqueda no retornó resultados";
	
	public  SearchWithNoResult(String message, Throwable cause) {
		super(message, cause);
	}	
}


