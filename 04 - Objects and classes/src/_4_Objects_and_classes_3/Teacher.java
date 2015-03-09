package _4_Objects_and_classes_3;

public class Teacher {
	private String fName;
	private String lName;
	private Course[] courses;
	public String getfullName() {
		return fName + " " + lName;
	}
	public void addCourse(Course aCourse){
		
	}
	public void removeCourse(Course aCourse){
		
	}
	public Course[] getCourses() {
		return courses;
	}
	public void setCourses(Course[] courses) {
		this.courses = courses;
	}
	
}
