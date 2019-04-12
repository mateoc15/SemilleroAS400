package reto2;
import java.util.Scanner;
public class Message {
	
	Scanner scanner = new Scanner(System.in);

	public String readMessage() {
		System.out.print("Entre su mensaje: ");
        return scanner. nextLine();
	}
	
	public void printMessage(String message) {
		System.out.println("El mensaje ingresado es: "+message);
	}
}
