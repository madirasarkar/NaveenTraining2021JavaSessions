package javaSessions;

public class ClassAssignmentSwitchCaseConversion29thMarch {
	public static int getStudentMarksUsingSwitchCase(String studentName) {

		System.out.println("Student's name is : " + studentName);
		int marks = -1;
		switch (studentName) {
		case "Asif":
			marks = 90;
			return marks;
		case "Pawan":
			marks = 80;
			return marks;
		case "Sri":
			marks = 95;
			return marks;
		default:
			System.out.println("Invalid student name " + studentName);
			return marks;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassAssignmentSwitchCaseConversion29thMarch std = new ClassAssignmentSwitchCaseConversion29thMarch();
		int k = std.getStudentMarksUsingSwitchCase("Asif");
		System.out.println(k);
	}

}
