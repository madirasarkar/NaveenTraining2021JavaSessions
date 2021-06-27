package javaSessions;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList ar = new ArrayList();
		System.out.println(ar.size());
		ar.add(100);//0
		System.out.println(ar.size());
		ar.add(200);//1
		ar.add(300);//2
		System.out.println(ar.size());
		ar.add(400);//3
		ar.add(500);//4
		System.out.println(ar.size());
		ar.add(600);//5
		ar.add(700);//6
		System.out.println(ar.size());
		ar.add(12.33);//7
		ar.add('m');//8
		ar.add("java");//9
		System.out.println(ar.get(9));
		ar.add(1000);//10
		ar.add(2000);//11
		System.out.println(ar.size());
ar.add(3000);//12
ar.add(4000);//13
ar.add(5000);//14
ar.add(6000);//15
System.out.println(ar.size());
	}

}
