package javaSessions;

public class MethodsAssignment {
//1.Write a program to print the sum of two numbers entered by user by defining your own method.
	public int sum(int m, int n) {
		int sumCalculated = (m + n);
		System.out.println("The sum of " + m + " and " + n + " is=" + sumCalculated);
		return sumCalculated;
	}

	// 2. Define a method that returns the product of two numbers entered by user.
	public int mul(int x, int y) {
		int mulResult = (x * y);
		System.out.println("The product of " + x + " and " + y + " is=" + mulResult);
		return mulResult;
	}

	// 3.Write a program to print the circumference and area of a circle of radius
	// entered by user by defining your own method.
	public double circumference(double rad) {
		double circumferenceResult = (2 * 3.14 * rad);
		System.out.println("The circumference of circle having radius  " + rad + " is:" + circumferenceResult);
		return circumferenceResult;

	}

	public double area(double radius) {
		double areaResult = (3.14 * radius * radius);
		System.out.println("The circumference of circle having radius  " + radius + " is:" + areaResult);
		return areaResult;

	}
	// 4. Define two methods to print the maximum and the minimum number
	// respectively among three numbers entered by user.

	public double max(double a, double b, double c) {
		if (a > b && a > c) {
			System.out.println("The maximum number between " + a + "," + b + " & " + c + " is:" + a);
			return a;
		} else if (b > a && b > c) {
			System.out.println("The maximum number between " + a + "," + b + " & " + c + " is:" + b);
			return b;
		} else if (c > a && c > b) {
			System.out.println("The maximum number between " + a + "," + b + " & " + c + " is:" + c);
			return c;
		} else if (a == b && a > c) {
			System.out.println("The maximum number between " + a + "," + b + " & " + c + " are:" + a + " & " + b);
			return a;
		} else if (a == c && a > b) {
			System.out.println("The maximum number between " + a + "," + b + " & " + c + " are:" + a + " & " + c);
			return a;
		} else if (b == c && a > c) {
			System.out.println("The maximum number between " + a + "," + b + " & " + c + " are:" + b + " & " + c);
			return b;
		} else {
			System.out.println("All three numbers " + a + "," + b + " & " + c + " are equal ");
			return a;
		}
	}

	public double min(double a, double b, double c) {
		if (a < b && a < c) {
			System.out.println("The minimun number between " + a + "," + b + " & " + c + " is:" + a);
			return a;
		} else if (b < a && b < c) {
			System.out.println("The minimun number between " + a + "," + b + " & " + c + " is:" + b);
			return b;
		} else if (c < a && c < b) {
			System.out.println("The minimum number between " + a + "," + b + " & " + c + " is:" + c);
			return c;
		} else if (a == b && a < c) {
			System.out.println("The minimum number between " + a + "," + b + " & " + c + " are:" + a + " & " + b);
			return a;
		} else if (a == c && a < b) {
			System.out.println("The minimum number between " + a + "," + b + " & " + c + " are:" + a + " & " + c);
			return a;
		} else if (b == c && a < c) {
			System.out.println("The minimum number between " + a + "," + b + " & " + c + " are:" + b + " & " + c);
			return b;
		} else {
			System.out.println("All three numbers " + a + "," + b + " & " + c + " are equal ");
			return a;
		}
	}

	// 5. Define a program to find out whether a given number is even or odd
	public boolean isEven(double p) {
		if (p % 2 == 0) {
			System.out.println(p + " is an even number");

		} else {
			System.out.println(p + " is an odd number");
		}
		return false;
	}
	// 6. A person is eligible to vote if his/her age is greater than or equal to
	// 18.
	// Define a method to find out if he/she is eligible to vote.

	public boolean votingEligibility(int age) {
		if (age >= 18) {
			System.out.println(" You are eligible to vote");
		} else if (age < 0) {
			System.out.println(" Age is invalid");

		} else {
			System.out.println("You are not eligible to vote yet");
		}
		;
		return false;
	}

	public static void main(String[] args) {
		MethodsAssignment obj = new MethodsAssignment();

//1.Write a program to print the sum of two numbers entered by user by defining your own method.
		int sumOfTwoNumbers = obj.sum(10, 6);
		System.out.println("-----------------------");
// 2. Define a method that returns the product of two numbers entered by user.
		int product = obj.mul(5, 6);
		System.out.println("-----------------------");
// 3.Write a program to print the circumference and area of a circle of radius
// entered by user by defining your own method.
		double circleCircumference = obj.circumference(2.5);
		double circleArea = obj.area(2.5);
		System.out.println("----------------------");

// 4. Define two methods to print the maximum and the minimum number
// respectively among three numbers entered by user.

		double maxNumber = obj.max(10, 20, 30);
		System.out.println("---------------------------------");

		double minNumber = obj.min(10, 20, 30);
		System.out.println("----------------------------------------");
		// 5. Define a program to find out whether a given number is even or odd

		boolean b = obj.isEven(10);
		System.out.println("----------------------------------");

		// 6. A person is eligible to vote if his/her age is greater than or equal to
		// 18.
		// Define a method to find out if he/she is eligible to vote.
		boolean v = obj.votingEligibility(55);
		System.out.println("---------------------------");


	}

}
