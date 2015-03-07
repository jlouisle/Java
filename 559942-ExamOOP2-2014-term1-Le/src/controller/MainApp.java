package controller;

import java.util.ArrayList;

import utility.AnimalType;
import model.Animal;
import model.Person;
import model.Treatment;

public class MainApp {
	public static Animal[] pettingZoo = new Animal[5];
	public static ArrayList<Animal> pettingZooo = new ArrayList<Animal>();
	
/*	static{
		pettingZoo[0] = new Animal("Bella 1",10000,AnimalType.COW);
		pettingZoo[1] = new Animal("Bella 2",10000,AnimalType.COW);
		pettingZoo[2] = new Animal("Hunter",10000,AnimalType.CAT);
		pettingZoo[3] = new Animal("Fluffy",10000,AnimalType.RABBIT);
		pettingZoo[4] = new Animal("Blackie",10000,AnimalType.DOG);
	}*/
	static{
		pettingZooo.add(new Animal("Bella 1",10000,AnimalType.COW));
		pettingZooo.add(new Animal("Bella 2",10000,AnimalType.COW));
		pettingZooo.add(new Animal("Hunter",10000,AnimalType.CAT));
		pettingZooo.add(new Animal("Fluffy",10000,AnimalType.RABBIT));
		pettingZooo.add(new Animal("Blackie",10000,AnimalType.DOG));
	}
	
	public static void main(String[] args) {
	printZoo();
	pettingZooo.get(0).addTreatment(new Treatment("Back rub", "USD", 10.00));
	printZoo();
	//System.out.println(pettingZooo.get(0).getPrice());
	Person Louis = new Person("Louis", "Le", "Bergwijkdreef 440");
	System.out.println(Louis.toString());
	Louis.addAnimal(new Animal("Sushi",10,AnimalType.DOG));
	System.out.println(Louis.toString());
	}


	
	private static void printZoo(){
		System.out.println("The current petting zoo looks like:");
		for(Animal x: pettingZooo)
			System.out.println(x.toString());
		System.out.println();
	}
	
}