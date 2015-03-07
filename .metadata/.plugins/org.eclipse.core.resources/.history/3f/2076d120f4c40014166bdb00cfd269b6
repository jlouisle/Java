import java.util.Scanner;


public class W_3_Exercise_2 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter number of dice:");
		int numberOfDice = in.nextInt();
		System.out.println("Enter number of side(s) on dice:");
		int numberOnDice = in.nextInt();
		in.close();
		
		int result[] = new int[numberOnDice];
		
		for(int i = 0; i < numberOfDice; i++){
			int dots = (int) (Math.random() * numberOnDice) + 1;
			result[dots-1]++;
		}
		
		for(int j = 0; j < numberOnDice; j++) {
	        System.out.printf("%d was rolled %d time(s).\n",(j+1),result[j]);
	    }
	}
}
