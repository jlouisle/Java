import java.util.Date;


public class Student {
	private int studentNumber;
	private String fName;
	private String lName;
	private Date dob;
	
	public int getStudentNumber() {
		return studentNumber;
	}
	public String getfName() {
		return fName;
	}
	public String getlName() {
		return lName;
	}
	public Date getDob() {
		return dob;
	}
	public int age() {
		return 0;
	}
	public String fullName(){
		return fName + " " + lName;
	}
	
}
