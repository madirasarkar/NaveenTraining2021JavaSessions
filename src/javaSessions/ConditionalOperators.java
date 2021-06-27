package javaSessions;

public class ConditionalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 100;
		int b = 20;
		System.out.println(a == b);

		if (a == b) {
			System.out.println("both are equal");
		} else {
			System.out.println("Both are not equal");

		}
		if (a >= b) {
			System.out.println("a is greater than b");
		} else {
			System.out.println("b is greater than a");
		}

		boolean flag = false;
		if (flag) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}

		if (true) {
			System.out.println("Hiii");
		} else {// dead code
			System.out.println(("hello.."));
		}

		String browser = "safari";
		if (browser.equals("chrome")) {
			System.out.println("Launch chrome");
		} else if (browser.equals("firefox")) {
			System.out.println("Launch firefox");
		} else if (browser.equals("IE")) {
			System.out.println("Launche IE");
		} else if (browser.equals("safari")) {
			System.out.println("Launch safari");
		} else {
			System.out.println("Please pass the correct browser name..." + browser);
		}

	}
}
