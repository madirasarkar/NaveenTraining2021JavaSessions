package javaSessions;

public class LoopsConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//1. while loop
//print 1 to 10

		int i = 1;
		while (i <= 10) {
			System.out.println(i);
			i++;
		}
		System.out.println("-------------------------------");

		int k = 1;
		while (k <= 100) {
			System.out.println(k);
			if (k % 5 == 0) {
				System.out.println("hello...");
				break;// break the while loop
			}
			k++;

		}
		System.out.println("---------------------");
//2.for loop
// print 1 to 10
		for (int m = 1; m <= 10; m++) {
			System.out.println(m);

		}
		System.out.println("---------------");
		/*
		 * for (;;) { System.out.println("hi");//infinite loop example }
		 */
// print a to z 
		for (char x = 'a'; x <= 'z'; x++) {
			System.out.print(x);
		}
		System.out.println("---------------------");
//print ascivalue for a to z
		for (char p = 'a'; p <= 'z'; p++) {
			System.out.println(p + 0);
		}
		System.out.println("---------------------");
		for (double d = 1.0; d <= 5.0; d++) {
			System.out.println(d);
		}
		System.out.println("---------------------");
// print even numbers :0 2 4 6 8 10

		for (int d = 0; d <= 10; d++) {
			if (d % 2 == 0) {
				System.out.println(d);

			}
			System.out.println("---------------------");
//print 0 2 4 6 8 10 - 2nd way using for loop

			for (int w = 0; w <= 10; w = w + 2) {
				System.out.println(w);

			}

		}
	}

}
