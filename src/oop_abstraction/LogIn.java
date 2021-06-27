package oop_abstraction;

public class LogIn extends page {

	public LogIn() {
		System.out.println("LogIn----const");
	}

	@Override
	public void title() {
		System.out.println("LP---title");

	}

	@Override
	public void header() {
		System.out.println("LP-----header");

	}
	
	public void doLogIn() {
		
		System.out.println("Log in to app---");
	}

}
