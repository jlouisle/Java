package _4_Objects_and_classes_3;

public class Course {
	private String code;
	private String name;
	private int credits;
	
	public Course(String name, String code, int credits) {
		super();
		this.name = name;
		this.code = code;
		this.credits = credits;
	}
	
	public String getCode() {
		return code;
	}
	public String getName() {
		return name;
	}
	public int getCredits() {
		return credits;
	}
}