package javaSessions;

public class ClassAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * //1.Print odd numbers from 0-10
		 * 
		 * for (int i = 1; i <= 10; i++) { if (i % 2 != 0) { System.out.println(i); } }
		 * System.out.println("-----------");
		 * 
		 * // 2. print 10 to 1
		 * 
		 * for (int x = 10; x >= 1; x--) { System.out.println(x);
		 * 
		 * } System.out.println("-----------");
		 */

		// 3.While Loop

		// a.print 1 to 10
		int a = 1;
		while (a <= 10) {
			System.out.println(a);
			a++;
		}
		System.out.println("-----------");

		// b. print a to z
		char l = 'a';
		while (l <= 'z') {
			System.out.print(l);
			l++;
		}
		System.out.println();
		System.out.println("-----------");

		// c.print ASCII value for a to z
		char q = 'a';
		while (q <= 'z') {
			System.out.print(q + 0);
			q++;
		}
		System.out.println();
		System.out.println("-----------");

		// d. print even numbers 0 2 4 6 8 10
		int v = 0;
		while (v <= 10) {
			if (v % 2 == 0) {
				System.out.println(v);

			}
			v++;
		}
		System.out.println("-----------");

		// Find the time complexityy for the following code
		for (int k = 1; k <= 5; k++) {
			for (int p = 1; p <= 5; p++) {
				for (int y = 1; y <= 5; y++) {
					System.out.println("HI");
				}
			}
			// (1+n+n)(1+n+n)(1+n+n+n)==>(1+2n)(1+2n)(1+3n)
			// ++>(1+2n+2n+4n^2)(1+3n)
			// ==>(1+4n+4n^2)(1+3n)
			// ==>(1+3n+4n+12n^2+4n^2+12n^3)
			// ==>(1+7n+16n^2+12n^3)
			// ==>(7n+16n^2+12n^3)
			// ==>n(7+16n+12n^2)
			// ==>n(16n+12n^2)
			// ==>n(n+n^2)
			// ==>n^2(1+n)
			// ==>n^2(n)
			// ==>n^3

		}

	}
}
