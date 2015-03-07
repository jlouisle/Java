import java.util.Scanner;


public class classroom {
	private static Scanner in;
	private static Student[] allStudents;
	
	public static void main(String[] args) {
		in = new Scanner(System.in);
		System.out.println("Give the number of students: ");
		int nrOfStudents = in.nextInt();
		allStudents = new Student[nrOfStudents];
		for  (int i=0; i < nrOfStudents; i++){
			in = new Scanner(System.in);
			System.out.println("Give name: ");
			String name = in.nextLine();
			Student newStudent = new Student(name);
			allStudents[i] = newStudent;
		}
		for (Student aStudent: allStudents){
			System.out.println(aStudent);
			}
	}
}