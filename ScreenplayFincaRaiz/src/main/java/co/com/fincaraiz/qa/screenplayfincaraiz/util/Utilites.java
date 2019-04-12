package co.com.fincaraiz.qa.screenplayfincaraiz.util;

import java.io.IOException;
import java.net.InetAddress;
import java.net.URL;
import java.net.URLConnection;

import net.serenitybdd.screenplay.Performable;

/**Utilidades
 * @author SEMILLERO09
 *
 */
public class Utilites {

	/**
	 * Constructor
	 */
	public Utilites() {
		// TODO Auto-generated constructor stub
	}
	
	
	/**M�todo utilizado para generar un n�mero
	 * aleatorio y seleccionar un elemento de la 
	 * lista de resultados de la b�squeda
	 *
	 * @param size
	 * @return
	 */
	public static int randomNumber(int size) {
		return (int) Math.floor(Math.random()*size);
	}
	
	
	public static Boolean check() throws IOException {
		try { 
            URL url = new URL("https://www.geeksforgeeks.org/"); 
            URLConnection connection = url.openConnection(); 
            connection.connect(); 
  
            System.out.println("Connection Successful"); 
            return true;
        } 
        catch (Exception e) { 
            System.out.println("Internet Not Connected");
            return false;
        } 
	}
	
	

}