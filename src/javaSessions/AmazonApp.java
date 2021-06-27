package javaSessions;

public class AmazonApp {
	public void login() {

	}

	public void login(int i) {
		System.out.println(i);
	}

	public void login(int i, int j) {

	}

	public void login(int i, String j) {
		System.out.println(i + j);
	}

	public void login(String i, int j) {

	}

	// log in
	public void doLogin(String uId, String pwd) {

	}

	public void doLogin(String uId, String pwd, String role) {

	}

	public void doLogin(String uId, String pwd, long ph, int otp) {

	}

	public void doLogin(String uId, long ph) {

	}

//eComm Application
//product search
	public void search() {
	}

	public void search(String name) {
	}

	public void search(String name, int price) {
	}

	public void search(String name, int price, String seller) {
	}

	public void search(String color, String name, int price) {
	}

	// car booking system-ubar
	public void carBooking(String type) {
	}

	public void carBooking(String type, String from, String to) {
	}

	public void carBooking(String type, String from, String to, String pool) {
	}

	// payment on ecom site after adding to cart
	public void payment(String cc, String pwd) {
	}

	public void payment(String cc, String pwd, int otp) {
	}

	public void payment(String paypal) {
	}

	public static void main(String[] args) {
		AmazonApp a1 = new AmazonApp();
		a1.login(10, "Madira");

	}

}
