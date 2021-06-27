package javaSessions;

public class SwitchCaseConcept {

	public static void main(String[] args) {
		String browser = "opera";

		switch (browser) {
		case "chrome":
			System.out.println("Launch Chrome");
			break;

		case "firefox":
			System.out.println("Launch Firefox");
			break;
		case "IE":
			System.out.println("Launch IE");
			break;

		case "safari":
			System.out.println("Launch safari");
			break;
		default:
			System.out.println("Please pass the correct browser..." + browser);
		}

	}

}
