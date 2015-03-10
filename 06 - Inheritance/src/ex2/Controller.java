package ex2;

public class Controller {
	public static void main(String[] args) {
		HourlyWorker j = new HourlyWorker();
		j.setName("Jay");
		j.setSalary(25);
		System.out.printf("%s's weekly income is %g USD.",j.getName(),j.computePay(80));
	}
}
