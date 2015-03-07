import java.util.Scanner;


public class W_3_Exercise_7 {

	public static void main(String[] args) {
		
		Scanner userinput = new Scanner(System.in);
		
		System.out.println("Give the width of the matrix:");
		int width = userinput.nextInt();	
		System.out.println("Give the height of the matrix:");
		int height = userinput.nextInt();
		boolean array[][] = new boolean[height][width];
		
		for(int i = 0; i < height; i++){
			for(int j = 0; j < width; j++){
				array[i][j] = (Math.random() < 0.1);
			}
		}
		
		for(int i = 0; i < height; i++){
			for(int j = 0; j < width; j++){
				System.out.printf("--");
			}
			System.out.printf("\n|");
			for(int j = 0; j < width; j++){
				if(array[i][j]){
					System.out.printf("X|");
				}else{
					System.out.printf(" |");
				} 
			}
			System.out.printf("\n");
		}
		for(int j = 0; j < width; j++){
			System.out.printf("--");
		}
		userinput.close();
	}

}
/*
Create an application that asks for the width and height of a bitmatrix. 
Then it creates a 2-dimensional array of booleans and sets the bits 
randomly on true or false. One out of ten bits should be true, the rest 
false. After creating and filling the matrix, print it to the console.
*/