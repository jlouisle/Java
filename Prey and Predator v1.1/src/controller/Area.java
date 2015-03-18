package controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CyclicBarrier;

import model.Animal;
import model.Constants;
import model.Location;
import model.rabbit.Rabbit;
import model.fox.Fox;
import view.Updateable;

public class Area {
	private long numberOfIterations = 0;
	CyclicBarrier synchronizationBarrier = new CyclicBarrier(Constants.NUMBER_OF_RABBITS);
	CyclicBarrier synchronizationBarrier2 = new CyclicBarrier(Constants.NUMBER_OF_FOXES);
	private int maxScreenSize;
	private List<Animal> animals;
	private Thread innerThread;
	private Updateable view;
	private Location size = new Location(Constants.AREA_SIZE,Constants.AREA_SIZE);// Size is in m

	public Area(Updateable view, int maxScreenSize) {
		this.maxScreenSize = maxScreenSize;
		this.view = view;
		synchronizationBarrier = new CyclicBarrier(Constants.NUMBER_OF_RABBITS);
		synchronizationBarrier2 = new CyclicBarrier(Constants.NUMBER_OF_FOXES);
		animals = Collections.synchronizedList(new ArrayList<Animal>());
		for (int i = 0; i< Constants.NUMBER_OF_RABBITS; i++) {
			long x = Math.round(Math.random() * this.maxScreenSize);
			long y = Math.round(Math.random() * this.maxScreenSize);
			animals.add(new Rabbit(this, synchronizationBarrier, new Location(x,y)));
		}
		for (int i = 0; i< Constants.NUMBER_OF_FOXES; i++) {
			long x = Math.round(Math.random() * this.maxScreenSize);
			long y = Math.round(Math.random() * this.maxScreenSize);
			animals.add(new Fox(this, synchronizationBarrier2, new Location(x,y)));
		}
		Runnable r = new Runnable() {

			@Override
			public void run() {
				doWork();
				
			}
		};
		innerThread =new Thread(r);
		innerThread.start();
	}

	public Location getSize() {
		return size;
	}

	public void setSize(Location size) {
		this.size = size;
	}

	public List<Animal> getAnimals() {
		return animals;
	}
	
	private void doWork() {
		while (true) {
			try {
				Thread.sleep(Constants.WAITING_TIME);
				numberOfIterations++;
				view.update();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
	
	public long elapsedDays() {
		return numberOfIterations * Constants.ITERATION_SPEED / Constants.NUMBER_OF_SECONDS_PER_DAY;
	}
	
	public boolean remove(Animal animal) {
		return animals.remove(animal);
	}

	public void add(Animal animal) {
		animals.add(animal);
		
	}
}
