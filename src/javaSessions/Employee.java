package javaSessions;

import java.util.ArrayList;

public class Employee {

	public Object[] getEmpData() {
		Object emp[] = new Object[4];
		emp[0] = "Poonam";
		emp[1] = 25;
		emp[2] = "Pune";
		emp[3] = "India";

		return emp;
	}

	public ArrayList<String> getEmpList() {
		ArrayList<String> empList = new ArrayList<String>();
		empList.add("Jion");
		empList.add("Ribhu");
		empList.add("Ron");
		return empList;

	}

	public static void main(String[] args) {
		Employee e1 = new Employee();
		System.out.println(e1.getEmpData()[0]);
		for (Object l : e1.getEmpData()) {
			System.out.println(l);
		}

		e1.getEmpList().stream().forEach(ele -> System.out.println(ele));
	}

}
