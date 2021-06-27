package javaSessions;

public class ClassAssignmentMarch29th {
	// TODO Auto-generated method stub
	// WAF using switch case & if-else
	// take browserName(String)-i/p, launch the browser and the return the browser
	// version(double)
	public double launchBrowser(String browserName) {
		System.out.println("Browser name is " + browserName);

		switch (browserName) {
		case "chrome":
			System.out.println("Launch Chrome");
			return 89.0;
		case "IE":
			System.out.println("Launch IE");
			return 11.0;

		case "firefox":
			System.out.println("Launch Firefox");
			return 87.0;
		case "safari":
			return 10.14;
		default:
			System.out.println("Pass the correct browser name " + browserName);
			return 0.0;
		}
	}

	public static void main(String[] args) {
		ClassAssignmentMarch29th obj = new ClassAssignmentMarch29th();
		double s = obj.launchBrowser("chrome");
		System.out.println(s);
	}

}
