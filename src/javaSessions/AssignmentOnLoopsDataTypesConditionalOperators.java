package javaSessions;

import java.util.Scanner;

public class AssignmentOnLoopsDataTypesConditionalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//LoopsAssignment
		// 1. I am Batman 5 times
		String str = "I am Batman";
		for (int i = 1; i <= 5; i++) {
			System.out.println(str);
		}
		System.out.println("---------------------------------------");
		// 2.I am Batman n 1-9 times
		for (int t = 1; t <= 9; t++) {
			System.out.println("I am Batman " + t);
		}
		System.out.println("---------------------------------------");
		// 3. print 10 to 1
		// using for loop

		for (int f = 10; f >= 1; f--) {
			System.out.println(f);
		}
		System.out.println("---------------------------------------");
		// using while loop
		int w = 10;
		while (w >= 1) {
			System.out.println(w);
			w--;
		}
		System.out.println("---------------------------------------");
		// using do while loop

		int y = 10;
		do {
			System.out.println(y);
			y--;
		} while (y >= 1);
		System.out.println("---------------------------------------");

		// 4. print "Hello World" ten times using while loop
		int repeat = 1;
		while (repeat <= 10) {
			System.out.println("Hello World");
			repeat++;
		}
		System.out.println("---------------------------------------");

		// 5. print 1 to 10 using while loop but quit if multiple of 7 is encountered

		int h = 1;
		while (h <= 10) {
			System.out.println(h);
			if ((h % 7) == 0) {
				break;
			}
			h++;
		}
		System.out.println("---------------------------------------");

		// Data Types
		// 1.print 'Hello' on screen and then print your name on a separate line
		System.out.println("Hello");
		System.out.println("Madira S");

		System.out.println("---------------------------------------");

		// 2.print the sum of two numbers |Test Data: 74 + 36| Expected Output :110

		int s = 74;
		int p = 36;
		System.out.println("Sum of " + s + " & " + p + " is: " + (s + p));
		System.out.println("---------------------------------------");

		// 3.divide two numbers and print on the screen |Test Data : 50/3 | Expected
		// Output :16
		int num1 = 50;
		int num2 = 3;
		System.out.println((num1 / num2));

		System.out.println("---------------------------------------");
		// 4.a)a. -5 + 8 * 6
		int a1 = -5;
		int a2 = 8;
		int a3 = 6;

		System.out.println(a1 + "+" + a2 + "*" + a3 + "=" + (a1 + a2 * a3));
		System.out.println("---------------------------------------");
		// b). (55+9) % 9
		int b1 = 55;
		int b2 = 9;
		int b3 = 9;

		System.out.println("(" + b1 + "+" + b2 + ")" + "%" + b3 + "=" + (b1 + b2) % b3);
		System.out.println("---------------------------------------");

		// c)20 + -3*5 / 8

		int c1 = 20;
		int c2 = -3;
		int c3 = 5;
		int c4 = 8;
		int c5 = c1 + c2 * c3 / c4;
		System.out.println(c1 + "+" + c2 + "*" + c3 + "/" + c4 + "=" + c5);
		System.out.println("---------------------------------------");

		// d) 5 + 15 / 3 * 2 - 8 % 3
		int d1 = 5;
		int d2 = 15;
		int d3 = 3;
		int d4 = 2;
		int d5 = 8;
		int d6 = 3;
		int d7 = d1 + d2 / d3 * d4 - d5 % d6;
		System.out.println(d1 + "+" + d2 + "/" + d3 + "*" + d4 + "-" + d5 + "%" + d6 + "=" + d7);
		System.out.println("---------------------------------------");

		// 5.((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))

		double f1 = 25.5;
		double f2 = 3.5;
		double f3 = 40.5;
		double f4 = 4.5;
		double f5 = (double) ((f1 * f2 - f2 * f2) / (f3 - f4));
		System.out.println("(" + "(" + f1 + "*" + f2 + "-" + f2 + "*" + f2 + ")" + "/" + "(" + f3 + "-" + f4 + ")" + ")"
				+ "=" + f5);

		System.out.println("---------------------------------------");
		// 6. concat "Hello Selenium" with a character 't

		String str6 = "Hello Selenium";
		char c100 = 't';
		System.out.println(c100 + str6);
		System.out.println("---------------------------------------");

		// 7.Create three int variables having values like : 100, 200, 3400.
		// Add them and concatenate and generate this output String : "Your Total amount
		// is. 3700".

		int w1 = 100;
		int w2 = 200;
		int w3 = 3400;
		int w4 = (w1 + w2 + w3);

		System.out.println("Your Total amount is." + w4);
		System.out.println("---------------------------------------");

		// 8 byte b3 = 065;
		// System.out.println(b3)

		byte bt = 065;
		System.out.println(bt);

	}	
}
