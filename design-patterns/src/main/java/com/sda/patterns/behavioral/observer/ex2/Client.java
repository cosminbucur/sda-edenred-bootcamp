package com.sda.patterns.behavioral.observer.ex2;

public class Client {

	public static void main(String[] args) {
		// create the parking to store cars
		Parking parking = new Parking();

		// register listeners to be notified when a car is added
		PrintNameCarAddedListener printNameListener = new PrintNameCarAddedListener();
		parking.register(printNameListener);

		CountingCarAddedListener countListener = new CountingCarAddedListener();
		parking.register(countListener);

		// add a car notify the registered listeners
		parking.addCar(new Car("audi"));
		parking.addCar(new Car("bwm"));

		parking.unregister(countListener);
		parking.addCar(new Car("dacia"));
	}
}
