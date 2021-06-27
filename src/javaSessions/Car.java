package javaSessions;

public class Car {

	String name;
	int price;
	String color;
	static final int wheels = 4;

	public static void main(String[] args) {
		Car c1 = new Car();
		c1.name = "BMW";
		c1.price = 60;
		c1.color = "Red";

		System.out.println(c1.name + " " + c1.price + " " + c1.color + " " + Car.wheels);
		// System.out.println(c1.wheels);
		System.out.println(wheels);

		Car c2 = new Car();
		c2.name = "Audi";
		c2.price = 50;
		c2.color = "White";

		Car c3 = new Car();
		c3.name = "Mercedes";
		c3.price = 70;
		c3.color = "Red";
	}

}
