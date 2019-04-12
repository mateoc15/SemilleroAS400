package co.com.fincaraiz.qa.screenplayfincaraiz.exceptions;

public class NoInterenetConnection extends AssertionError {
	
public static final String NO_INTERNET_CONNECTION="No hay conexión a internet para comenzar con el test";
	
	public NoInterenetConnection(String message, Throwable cause) {
		super(message, cause);
	}
}
