package javaSessions;

public class stringManipulation {

	public static void main(String[] args) {
		String str = "hello This is my java code and I am so happy int";
		System.out.println(str.length());
		System.out.println("Li= " + 0);
		System.out.println("len= " + str.length());
		System.out.println("Hi= " + (str.length() - 1));

		System.out.println(str.charAt(1));
		System.out.println(str.indexOf('i'));// 1st occurrence of i
		System.out.println(str.indexOf('i', str.indexOf('i') + 1));// 2nd occurrence of i
		// WAF to find the 3rd occurrence of i in the str
		System.out.println(str.indexOf('i', (str.indexOf('i', str.indexOf('i') + 1)) + 1));

		System.out.println(str.indexOf("java"));
		System.out.println(str.indexOf("madira"));
	}

}
