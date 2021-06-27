package javaSessions;

public class FunctionsInJava {
	public void test() {

		System.out.println("Test Method");

	}

	public String getName() {
		System.out.println("get name methhod");
		return "Selenium";
	}

	public int getScore() {
		System.out.println("get score method");
		int run = 100;
		int wd = 10;
		int totalRuns = run + wd;
		return totalRuns;
	}

	public int add(int a, int b) {
		System.out.println("add method");
		int c = a + b;
		System.out.println(c);
		return c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FunctionsInJava f = new FunctionsInJava();
		f.test();
		String name = f.getName();
		System.out.println(name);

		int score = f.getScore();
		System.out.println(score);

		int s1 = f.add(10, 20);
		System.out.println(s1);
	}

}
