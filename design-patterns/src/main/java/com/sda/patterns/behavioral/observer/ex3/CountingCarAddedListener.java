package com.sda.patterns.behavioral.observer.ex3;

public class CountingCarAddedListener implements CarAddedListener {

	private static int carCount = 0;

	@Override
	public void onCarAdded(Car car) {
		// Increment the number of cars
		carCount++;

		// Print the number of cars
		System.out.println("Total cars added: " + carCount);
	}
}