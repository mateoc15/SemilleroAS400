package com.gmail.mailsenderscreenplay.models;

public class Credentials {

	private String user;
	private String pass;
	
	public Credentials(String user, String pass) {
		super();
		this.user = user;
		this.pass = pass;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}


}
