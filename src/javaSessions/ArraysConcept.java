package javaSessions;

public class ArraysConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int array
		int i[] = new int[4];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;

		System.out.println("li=" + 0);// lowest index
		int len = i.length;
		System.out.println("length=" + len);// length of the array
		System.out.println("hi=" + (len - 1));// Highest index;
		System.out.println(i[0]);
		System.out.println(i[1]);

		// print all the values from an array:use for loop
		for (int k = 0; k < i.length; k++) {
			System.out.println(i[k]);
		}

		// for each/enhance each loop:
		for (int e : i) {
			System.out.println(e);
		}

	}

}
