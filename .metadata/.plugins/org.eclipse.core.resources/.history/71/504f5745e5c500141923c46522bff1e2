package _3_More_on_Java_syntax;
import java.util.Scanner;


public class W_3_Exercise_10 {
	public static void main(String[] args) {
		
		int method = 0;
		boolean next = false;
		Scanner input = new Scanner(System.in);
		
		while(!next){
			System.out.println("Options:");
			System.out.println("[1]_transposition\n[2]_addition\n[3]_scalar_multiplication\n[4]_product_of_two_matrices");
			int in = input.nextInt();
			switch(in){
			case 1:
				method = 1;
				next = true;
				break;
			case 2:
				method = 2;
				next = true;
				break;
			case 3:
				method = 3;
				next = true;
				break;
			case 4:
				method = 4;
				next = true;
				break;
			default:
				System.out.println("Invalid option.");
			}
		}
		System.out.println("Enter height of matrix:");
		int hei = input.nextInt();
		System.out.println("Enter width of matrix:");
		int wid = input.nextInt();
		
		int matrix[][] = new int[hei][wid];

		for (int y = 0; y < hei; y++){
			for (int x = 0; x < wid; x++ ){
				System.out.printf("Row %d, Col %d:",y+1,x+1);
				matrix[y][x] = input.nextInt();
			}
		}
        System.out.println("\nMatrix:");
		for (int i = 0; i < hei; ++i){
			System.out.print("\n|");
			for (int j = 0; j < wid; j++ ){
				System.out.print(matrix[i][j]+"|");
			}
		}
		
		if(method == 1){
			System.out.println("\n\nTransposed!");
			for (int y = 0; y < wid; ++y){
				System.out.print("\n|");
				for (int x = 0; x < hei; ++x ){
					System.out.print(matrix[x][y]+"|");
				}
			}
		}
		else if (method == 2){
			int matrix2[][] = new int[hei][wid];
			int matrix3[][] = new int[hei][wid];
			System.out.println("\n\nSecond matrix values:\n");
			for (int i = 0; i < hei; i++){
				for (int j = 0; j < wid; j++ ){
					System.out.printf("Row %d, Col %d:",i+1,j+1);
					matrix2[i][j] = input.nextInt();
				}
			}
	        System.out.println("\nSecond matrix:");
			for (int i = 0; i < hei; ++i){
				System.out.print("\n|");
				for (int j = 0; j < wid; j++ ){
					System.out.print(matrix2[i][j]+"|");
				}
			}
			System.out.println("\n\nAdded!");
			for(int i = 0; i < hei; i++){
				for(int j = 0; j < wid; j++){
					matrix3[i][j] = matrix[i][j] + matrix2[i][j];
				}
			}
			for (int i = 0; i < hei; ++i){
				System.out.print("\n|");
				for (int j = 0; j < wid; j++ ){
					System.out.print(matrix3[i][j]+"|");
				}
			}
		}
		else if (method == 3){
			System.out.println("\n\nScale:");
			int sc_mult = input.nextInt();

			for(int i = 0; i < hei; i++){
				for(int j = 0; j < wid; j++){
					matrix[i][j] *= sc_mult;
				}
			}

			System.out.println("\nMultiplied!");
			for (int i = 0; i < wid; ++i){
				System.out.print("\n|");
				for (int j = 0; j < hei; j++ ){
					System.out.print(matrix[i][j]+"|");
				}
			}
		}
		else if(method == 4){
			int sum = 0;
			int matrix2[][] = new int[wid][hei];
			int matrix3[][] = new int[hei][hei];
			System.out.println("\n\nSecond matrix values:\n");
			for (int i = 0; i < wid; i++){
				for (int j = 0; j < hei; j++ ){
					System.out.printf("Row %d, Col %d:",i+1,j+1);
					matrix2[i][j] = input.nextInt();
				}
			}
	        System.out.println("\nSecond matrix:");
			for (int i = 0; i < wid; ++i){
				System.out.print("\n|");
				for (int j = 0; j < hei; j++ ){
					System.out.print(matrix2[i][j]+"|");
				}
			}
			for (int c = 0; c < hei; c++){
			   for (int d = 0; d < hei; d++){   
			      for (int k = 0; k < wid; k++){
			         sum = sum + matrix[c][k]*matrix2[k][d];
			      }
			      matrix3[c][d] = sum;
			      sum = 0;
			   }
			}
	        System.out.println("\nProduct:");
			for (int i = 0; i < hei; ++i){
				System.out.print("\n|");
				for (int j = 0; j < hei; j++ ){
					System.out.print(matrix3[i][j]+"|");
				}
			}
		}
		input.close();
	}
}
/*    
Write an application doing the following:
•	Show a menu asking whether the user wants to have 
transposition, addition, scalar multiplication or the 
product of two matrices
•	Ask for the size of a twodimensional matrix
•	Ask for the (numerical) value of each cell
•	If necessary, ask for the size of the second matrix.
•	Ask for the (numerical) value of each cell
•	Store the values in arrays
•	Do the calculation
•	Print the result to the console

*/