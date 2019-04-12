package co.com.fincaraiz.qa.screenplayfincaraiz.exceptions;

public class ResultNotMatch extends AssertionError{
	
public static final String RESULT_NOT_MATCH_MESSAGE="El elemento seleccionado no coincide con la busqueda realizada";
	
	public  ResultNotMatch(String message, Throwable cause) {
		super(message, cause);
	}	

}
