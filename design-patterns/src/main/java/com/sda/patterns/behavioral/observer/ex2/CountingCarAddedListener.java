package com.sda.patterns.behavioral.observer.ex2;

public class CountingCarAddedListener implements CarAddedListener {

	private static int carCount = 0;

	@Override
	public void onCarAdded(Car car) {
		// increment the number of cars
		carCount++;

		// print the number of cars
		System.out.println("Total cars added: " + carCount);
	}
}