package ex8;
import java.util.Arrays;
import java.util.Scanner;

//MAX = 62
public class W_3_Exercise_8 {

	public static void main(String[] args) {
		
		Scanner userinput = new Scanner(System.in);
		
		System.out.println("Number of rows:");
		int rows = userinput.nextInt();
		
		long array[][] = new long[rows][];
		
		for(int i = 0; i < rows; i++){
			long init = 1;
			array[i] = new long[i+1];
			for(int j = 0; j <= i;j++){
				if (j > 0) {
					init = (init * (i + 1 - j)) / j;
				}
				array[i][j] = init;
				//System.out.print(init + " ");
			}
			//System.out.print("\n");
			
			
			
		}
		System.out.println(Arrays.deepToString(array).replaceAll("],", "],\r\n"));
		userinput.close();
	}

}
/*
Read http://en.wikipedia.org/wiki/Pascal%27s_triangle to understand 
Pascal's triangle. Create an application which first asks the number
of rows from the user. Then fill a two-dimensional array with the 
relevant values. However, no memory should be wasted, so you'll 
have to use a ragged array. After filling the ragged array, show
it in the console. 
*/