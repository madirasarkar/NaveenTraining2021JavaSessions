package javaSessions;

import java.util.ArrayList;

public class ArrayAndArrayListAssignmentMarch26th {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Question 1: Write a program to print the following pattern using for loop:
		 * 
		 * 00 01 02 03 04 05 06 07 08 09 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25
		 * 26 27 28 29 30 31 32 33 34 35 36 37 38 39
		 */
		/*
		 * for (int i = 0; i <= 3; i++) { for (int j = 0; j <= 9; j++) {
		 * System.out.print(i + "" + j + " "); } System.out.println(); }
		 * System.out.println("----------------------------"); // Question 2: Write a
		 * program to create a static Array, having following // cricket data: //
		 * --name, age, team name, DOB, gender, Strike Rate // --Try to create multiple
		 * Object Arrays for different players // --Try to print all the values of each
		 * player on the console Object crickInfo[] = new Object[6]; crickInfo[0] =
		 * "Sachin"; crickInfo[1] = 46; crickInfo[2] = "India"; crickInfo[3] =
		 * "08-07-74"; crickInfo[4] = 'M'; crickInfo[5] = 85; for (int p = 0; p <
		 * crickInfo.length; p++) { System.out.print(crickInfo[p]);
		 * System.out.println(); } System.out.println("-----------------");
		 * 
		 * Object player1[] = { "Sachin", 46, "India", "08-07-74", 'M', 85.4 }; for (int
		 * l = 0; l < player1.length; l++) { System.out.print(player1[l] + " "); }
		 * System.out.println();
		 * 
		 * Object player2[] = { "Rahul", 45, "India", "07-09-75", 'M', 75.4 }; for (int
		 * l = 0; l < player2.length; l++) { System.out.print(player2[l] + " "); }
		 * System.out.println(); Object player3[] = { "Ganguli", 46, "India",
		 * "05-17-73", 'M', 80.4 }; for (int l = 0; l < player3.length; l++) {
		 * System.out.print(player3[l] + " "); } System.out.println();
		 * System.out.println("---------------------------"); /* Question 3: Try to
		 * print the following pattern on the console: n = 4 n = 3 n = 2 n = 1 n = 0
		 */
		/*
		 * for (int t = 4; t >= 0; t--) { System.out.println("n = " + t); }
		 * System.out.println("-------------------------");
		 */

		// 1. Write a Java program to create a new array list, add some colors (string)
		// and print out the collection

		ArrayList ar = new ArrayList();
		ar.add("Red");
		ar.add("Yellow");
		ar.add("Green");
		ar.add("Blue");
		ar.add("Pink");
		ar.add("White");
		ar.add("Purple");

		System.out.println(ar.size());
		System.out.println("---------------");
		for (int q = 0; q < ar.size(); q++) {
			System.out.println(ar.get(q));
		}
		System.out.println("-----------------------------");
		// 2. Write a Java program to insert an element into the
		// array list at the first and last positions.

		ar.add(0, "First");
		ar.add(ar.size(), "Last");
		for (int r = 0; r < ar.size(); r++) {
			System.out.println(ar.get(r));
		}
		System.out.println("-----------------------------");
		// 3. Write a Java program to retrieve an element (at a specified index)
		// from a given array list
		System.out.println(ar.get(5));
		System.out.println("----------------------");
		// 4. Write a Java program to update specific array element
		// by given element.
		ar.set(5, "Orrange");
		System.out.println("Replaced 5th index with " + ar.get(5));
		System.out.println("--------------------");
		for (int n = 0; n < ar.size(); n++) {
			System.out.println(ar.get(n));
		}
//5. Write a Java program to remove the third 
		// element from a array list.

		ar.remove(2);
		System.out.println("----------------------");
		// 6. Write a Java program to search an element in a array list.
		System.out.println(ar.indexOf("White"));
		System.out.println("--------------------");
		// 7. Write a Java program to reverse elements in a array list

		for (int y = ar.size() - 1; y >= 0; y--) {
			System.out.println(ar.get(y));
		}
		System.out.println("--------------------");
		// 8.Write a Java program to extract a portion of a array list.
		System.out.println(ar.subList(2, 5));
		System.out.println("--------------------");
		// 9. Write a Java program of swap two elements in an array list.

		// 10.10. Write a Java program to empty an array list.
		ar.clear();

	}

}
