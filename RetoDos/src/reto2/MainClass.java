package reto2;

public class MainClass {
	static Message msg = new Message();
	
	public static void main(String[] args) {
		msg.printMessage(msg.readMessage());	
	}

}
