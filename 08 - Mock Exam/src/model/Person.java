package model;

import java.util.ArrayList;

public class Person {
	
	private String first_name;
	private String last_name;
	private String address;
	private ArrayList<Animal> animals = new ArrayList<Animal>();
	
	public Person(String first_name, String last_name, String address) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.address = address;
	}

	public void addAnimal(Animal animal){
		animals.add(animal);
	}
	public void deleteAnimal(int index){
		animals.remove(index);
	}

	public String toString() {
		return first_name + " " + last_name + " has animals:\n" + getAnimals();
	}
	public String getAnimals() {
		String xt="";
		for(Animal x: animals)
			xt += x.toString() + "\n";
		return xt + "\n";
	}
	
	public String getName() {
		return first_name + " " +  last_name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}

	
	
	
	
	
	
}
