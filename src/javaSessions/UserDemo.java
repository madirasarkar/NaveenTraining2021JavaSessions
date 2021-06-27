package javaSessions;

public class UserDemo {

	public static void main(String[] args) {
		PageRegistration p1 = new PageRegistration(
				"John", "Reed","john@gmail.com", true);
		PageRegistration p2 = new PageRegistration(
				"Rima", 123456, 'F', false, 30);
		PageRegistration p3 = new PageRegistration(
				"Amit", "Shah", "amit@yahoo.com", "45#ab", 
				123456.00, 'M', false, 45);

		System.out.println(p1.firstName + " " + p1.lastName + " " +
		                  p1.emailId + " " + p1.isNewUser + " " + p1.age);
		System.out.println(p2.firstName + " " + p2.phNumber + " " +
		                  p2.isNewUser);
		System.out.println(p3.firstName + " " + p3.lastName + " " + 
		        p3.emailId + " " + p3.passWord + " " + p3.phNumber
				+ " " + p3.gender + " " + p3.isNewUser + " " + p3.age);
	}
}
