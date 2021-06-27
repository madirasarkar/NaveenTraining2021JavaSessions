package javaSessions;

public class IncrementalAndDecrementalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1.Post increment
		int a = 1;
		int b = a++;
		System.out.println(a);
		System.out.println(b);

		int c = -98;
		int d = c++;
		System.out.println(c);
		System.out.println(d);

		// 2.pre increment
		int m = 1;
		int n = ++m;
		System.out.println(m);
		System.out.println(n);

		int h = 2;
		System.out.println(h++);
		System.out.println(h);

		int g = 2;
		System.out.println(++g);
		System.out.println(g);

		// 3. post decrement:
		int x = 2;
		int y = x--;
		System.out.println(x);
		System.out.println(y);

		int f1 = -999;
		int f2 = f1--;
		System.out.println(f1);
		System.out.println(f2);

		// 4. pre decrement:
		int g1 = 2;
		int g2 = --g1;
		System.out.println(g1);
		System.out.println(g2);

		double d1 = 1.1;
		double d2 = d1++;
		System.out.println(d1);
		System.out.println(d2);

	}

}
