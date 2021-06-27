package javaSessions;

public class TimeComplexity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		System.out.println(i);
		// O(1)

		for (int i1 = 0; i1 <= 10; i1++) {
			System.out.println(i1);
		}
		// time complexity for the above code:
		// i1=1 will be executed 1 time, i1<=10 will be executed 10 times,
		// i1++ will be executed 10 times, print(i1) will be execute 10 times
		// so total , (1+10+10+10)=31 times for above code
		// n is iteration time
		// 1+n+n+n=1+3n -> 3n -> n ->O(n) [ removed all the constants 1 by 1]
		//

		for (int k = 1; k <= 5; k++) {
			for (int l = 1; l <= 5; l++) {
				System.out.println("HI");
			}
		}
// time complexity for the above code is 5*5 
		// n is the number of execution/iteration
		// n*n=n^2==>O(n^2)
		// (1+n+n)(1+n+n+n)==>(1+2n)(1+3n)==>(6n^2+5n+1)
		// ==>6n^2+5n==>n^2+n==>n(n+1)==>n(n)==>n^2

	}

}
