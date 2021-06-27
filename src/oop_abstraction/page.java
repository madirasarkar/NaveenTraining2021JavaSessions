package oop_abstraction;

public abstract class page {

	public page() {
		System.out.println("Page----const");
	}

	public abstract void title();

	public abstract void header();

	public void timeOut() {
		System.out.println("Page Timeout is 20 sec");
	}

	public final void logo() {
		System.out.println("App Logo");
	}
}
