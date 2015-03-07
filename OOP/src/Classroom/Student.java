package Classroom;
public class Student {
	public static int nextNumber = 1;
	private int studentNumber;
	private String name;
	
	
	@Override
	public String toString() {
		return "Student [studentNumber=" + studentNumber + ", name=" + name
				+ "]";
	}

	public Student(String name) {
		super();
		this.studentNumber = nextNumber++;
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStudentNumber() {
		return studentNumber;
	}
	
	
}
