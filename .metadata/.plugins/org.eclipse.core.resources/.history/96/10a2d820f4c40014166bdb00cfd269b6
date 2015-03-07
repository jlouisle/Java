import java.util.Scanner;

public class W_3_Exercise_3 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int numberOnDice = 0;
		int numberOfDice = 0;
		
		for(int i = 0; i == 0;){
			System.out.println("Enter number of side(s) on dice:");
			numberOnDice = in.nextInt();				
				
			switch (numberOnDice) {
	            case 4:case 6:case 8:case 10:case 12:case 20:case 30:case 100:
					i++;
					break;
	            default:
	            	System.out.println("Invalid! Choose one of the following: 4, 6, 8, 10, 12, 20, 30, or 100");
	                break;
	        }
		}
		
		System.out.println("Enter number of dice to roll:");
		numberOfDice = in.nextInt();
		in.close();
		
		int thrown[] = new int[numberOfDice];  
		int result[] = new int[numberOnDice];
		
		for(int i = 0; i < numberOfDice; i++){
			int dots = (int) (Math.random() * numberOnDice) + 1;
			thrown[i] = dots;
			result[dots-1]++;
		}
		
		for(int j = 0; j < numberOnDice; j++) {
	        System.out.printf("%d was rolled %d time(s).\n",(j+1),result[j]);
	    }
		
		
	}
}
/*
Change the application of exercise 2.2.
Now it has to check that the user only enters valid dice: 4-sided, 6-sided,
8-sided, 10-sided, 12-sided, 20-sided, 30-sided and 100-sided. If the user
enters another number, print a message and exit the application.
Also add a check on the number of times to roll; only positive integers are 
allowed. Use the API to find out how to do this. Hint: it's something like 
new Integer(String s).intValue().
*/