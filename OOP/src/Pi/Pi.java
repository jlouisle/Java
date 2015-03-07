package Pi;

public class Pi {
	public static void main(String[] args) {
		if (args.length == 0){
			System.out.println("Please enter the number of correct digits as the first parameter.");
			System.exit(0);
		}
		double m = Integer.parseInt(args[0]);
		System.out.println(calculatePi(m));;
	}
	public static double calculatePi(double m){
		double d = 1;
		int s = 1;
		boolean fin = false;
		double oldPi;
		double pi = 0;
		
		while(!fin){
			oldPi = pi;
			pi += (4/d)*s;
			s = -s;
			d += 2;
			if(Math.abs(oldPi-pi)<Math.pow(10, -(m+1))){
				fin = true;
			};
		}
		return pi;
		
	}
}
