package model;

public class Constants {
	
	//Contains general constants
	
	public static final int NUMBER_OF_SECONDS_PER_DAY = 24*60*60;
	
	// Simulation interval, to speed things up or down, in seconds
	public static final long INTERVAL = 60*60*24*7;
	
	// Time to wait until next iteration, in ms
	public static final long WAITING_TIME = 100;
	
	// Realtime between each iteration, in seconds * INTERVAL
	public static final  long ITERATION_SPEED = INTERVAL * WAITING_TIME / 1000;
	
	// Number of Rabbits to start with
	public static final int NUMBER_OF_RABBITS = 100;
	
	// Range of ids for Animals
	public static final double ID_RANGE = 1000000000;
	
	// Length of area's side in m
	public static long AREA_SIZE = 1000;

}
