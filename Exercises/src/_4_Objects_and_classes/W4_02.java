package _4_Objects_and_classes;
import java.util.Scanner;


public class W4_02 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Text:");
		String input = in.nextLine();
		if(input.equals(getReverse(input))){
			System.out.println("'" + input + "' is a palindrome!");
			in.close();
		}else{
			System.out.println("'" + input + "' is not a palindrome.");
		}
	}
	
	public static String getReverse(String s) {
		String reverse = "";
		for(int i = s.length(); i > 0; i--){
			reverse += s.charAt(i-1);
		}
		return reverse;
	}	
}
