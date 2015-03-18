package _4_01_Total_Years;
import java.util.Scanner;


public class Controller {

	public static Student[] allStudents;
	
	public static void main(String[] args) {
		Scanner usIn = new Scanner(System.in);
		System.out.println("Number of Students:");
		int x = usIn.nextInt();
		allStudents = new Student[x];
		
		for(int i = 0; i < allStudents.length;i++){
			allStudents[i] = new Student();
		}
		
		System.out.printf("Total Age: %d",allStudents[x-1].allAges(x-1,x-1,allStudents));
		usIn.close();
	}
}
