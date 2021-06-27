package webDriverArch;

public class chromeDriver implements WebDriver {
	public chromeDriver() {
		System.out.println("Launch Google Chrome");
	}

	@Override
	public void get(String url) {
		System.out.println("Enter the URL: " + url);

	}

	@Override
	public String getTitle() {

		return "some title";
	}

	@Override
	public void close() {
		System.out.println("Close the browser");

	}

	@Override
	public void maximize() {
		System.out.println("Maximize the window");

	}

	@Override
	public void click(String element) {
		System.out.println("Clicking on element: " + element);

	}

	@Override
	public void sendKeys(String value) {
		System.out.println("Pass the value to element: " + value);

	}

	@Override
	public void findElement(String element) {
		System.out.println("Find the element: " + element);

	}

	@Override
	public void findElements(String element) {
		System.out.println("Find the elements: " + element);

	}

}
