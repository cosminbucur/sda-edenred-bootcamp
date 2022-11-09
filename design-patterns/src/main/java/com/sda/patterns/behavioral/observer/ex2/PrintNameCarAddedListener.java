package com.sda.patterns.behavioral.observer.ex2;

public class PrintNameCarAddedListener implements CarAddedListener {

	@Override
	public void onCarAdded(Car car) {
		// print the name of the newly added car
		System.out.println("Added a new car with name '" + car.getName() + "'");
	}
}