package ex2;

public class HourlyWorker extends Worker{


	public double computePay(int hours) {
		
		int s = this.getSalary();
		
		if(hours>40){
			int overhours = hours - 40;
			hours -= 40;
			return (hours*s)+(overhours*s*1.5);
		}
		else {
			return s * hours;
		}
	}
	
}
