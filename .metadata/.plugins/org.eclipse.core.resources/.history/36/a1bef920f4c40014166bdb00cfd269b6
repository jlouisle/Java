import java.util.Scanner;


public class W_3_Exercise_9 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Matrix Height");
		int hei = input.nextInt();
		System.out.println("Matrix Width");
		int wid = input.nextInt();
		
		int matrix[][] = new int[hei][wid];
		
		for (int y = 0; y < hei; ++y){
			for (int x = 0; x < wid; ++x ){
				System.out.printf("value for Row %d, Col %d?",y+1,x+1);
				matrix[y][x] = input.nextInt();
			}
		}
		System.out.println("Transposing!");
		for (int y = 0; y < wid; ++y){
			System.out.print("\n|");
			for (int x = 0; x < hei; ++x ){
				System.out.print(matrix[x][y]+"|");
			}
		}
		input.close();
	}
	
}
/*    
Write an application doing the following:
•	Show a menu asking whether the user wants to have transposition, addition, scalar multiplication or the product of two matrices
•	Ask for the size of a twodimensional matrix
•	Ask for the (numerical) value of each cell
•	If necessary, ask for the size of the second matrix.
•	Ask for the (numerical) value of each cell
•	Store the values in arrays
•	Do the calculation
•	Print the result to the console

*/