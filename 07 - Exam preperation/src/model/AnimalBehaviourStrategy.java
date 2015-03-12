package model;

public interface AnimalBehaviourStrategy {
	Animal[] reproduce(Animal partner); // Give back an array of children of these two animals
	void move(); // Move the animal
	int getMaxAge();
	void setAnimal(Animal animal);
}
