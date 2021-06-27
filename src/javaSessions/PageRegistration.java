package javaSessions;

public class PageRegistration {
	String firstName;
	String lastName;
	String emailId;
	String passWord;

	double phNumber;
	char gender;
	boolean isNewUser;
	int age;

	public PageRegistration(String firstName, String lastName, String emailId, boolean isNewUser) {

		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.isNewUser = isNewUser;
	}

	public PageRegistration(String firstName, double phNumber, char gender, boolean isNewUser, int age) {

		this.firstName = firstName;
		this.phNumber = phNumber;
		this.gender = gender;
		this.isNewUser = isNewUser;
		this.age = age;
	}

	public PageRegistration(String firstName, String lastName, String emailId, String password,double phNumber, char gender,
			boolean isNewUser, int age) {

		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.phNumber = phNumber;
		this.gender = gender;
		this.isNewUser = isNewUser;
		this.age = age;
	}

}
