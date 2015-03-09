package ex5;
import java.util.Scanner;


public class W_3_Exercise_5 {

	public static void main(String[] args) {
		
		Scanner userinput = new Scanner(System.in);
		
		System.out.println("Enter number between 1 and 65535:");
		int input = userinput.nextInt();
		char ccc = (char) Integer.parseInt(String.valueOf(input), 16);
		System.out.println(ccc);
		System.out.println((char)65535);
		
		
		
		userinput.nextLine();
		
		System.out.println("Enter hexadecimal value of four digits:");
		String input2 = "0x"+userinput.nextLine();
		char xxx = (char) Integer.parseInt(String.valueOf(Integer.decode(input2)), 16);
		System.out.println(xxx);

		userinput.close();
	}

}
/*
Write an application asking for a number between 1 and 65535.
Print the character having this unicode value. Then ask for 
a hexadecimal value of four digits (hint: enter it as a String). 
Convert this value to a char and show it in the console. 
Hint: use Integer.decode.
*/