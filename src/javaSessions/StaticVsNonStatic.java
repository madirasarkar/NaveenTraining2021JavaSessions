package javaSessions;

public class StaticVsNonStatic {

	String name;
	static int age;

	public void getInfo() {

		System.out.println("get info................");
	}

	public static void sendMain() {

		System.out.println("Send Mail.............");
	}

	public static void main(String[] args) {
		StaticVsNonStatic obj = new StaticVsNonStatic();
		obj.name = "Tom";
		System.out.println(obj.name);
		obj.getInfo();

		age = 30;
		System.out.println(age);
		sendMain();
		System.out.println(StaticVsNonStatic.age);
		StaticVsNonStatic.sendMain();

	}

}
