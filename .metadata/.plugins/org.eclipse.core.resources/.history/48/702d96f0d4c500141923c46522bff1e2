package _2_Basics_of_Java_syntax;
import java.util.Scanner;


public class W_2_Exercise_6 {

	public static void main(String[] args) {
		
		String primes = "";
		Scanner in = new Scanner(System.in);
		System.out.println("Upper bound: ");
		int up = in.nextInt();
		in.close();
		//double max = Math.sqrt(up);
		if(up <= 2){
			System.out.println("Enter a number greater than 2.");
		}else{
			for(int i = 1;i<up;i++){
				if(isPrime(i)){
					primes += i + ",";
				};
			}
			System.out.println(primes);
		}
		
	}
	public static boolean isPrime(int p) {
		double max = Math.sqrt(p);
		for(int i = 2; i<max;i++){
			if(p%i==0){
				return false;
			}
		}
		return true;
	}

}
/*
We need an application to calculate prime numbers.
First, it has to ask for the upper bound to check.
The user enters a number greater than 2
(if not, ask for a valid number). Then the
application checks all numbers in range for
primality, printing found numbers to the console.
*/