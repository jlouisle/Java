package _4_01_Total_Years;

import java.util.Date;

public class Student {
	
	public static int created = 1;
	private int age;
	private int num;
	
	//Constructor
	public Student(){
		this.age = (int)(Math.random()*7)+16;
		this.num = created++;
	}
	
	//Getters
	public int getAge() {
		return this.age;
	}
	public int getNum() {
		return this.num;
	}

	
	
	//Own age + all before
	public int allAges(int x,int y,Student[] a){
		if(a[x].getNum() > 1){
			System.out.printf("Student %d asking student %d.\n",x+1,x);
			int r = a[x].getAge() + allAges(x-1,y,a);
			if(x==y){
				System.out.printf("Student %d has total.\n",x+1);
			}else{
				System.out.printf("Student %d answers student %d\n",x+1,x+2);
			}
			return r;
		}else{
			System.out.printf("Student %d answers student %d\n",x+1,x+2);
			return a[x].getAge();
		}
	}
}
