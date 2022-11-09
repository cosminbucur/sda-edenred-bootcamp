package com.sda.patterns.behavioral.observer.ex3;

public class Client {

	public static void main(String[] args) {
		// create the parking to store cars
		Parking parking = new Parking();

		// register listeners to be notified when a car is added
		CarAddedListener listener = car ->
				System.out.println("Added a new car with name '" + car.getName() + "'");
		parking.register(listener);
		parking.register(new CountingCarAddedListener());

		// add a car notify the registered listeners
		parking.addCar(new Car("audi"));

		// unregister the listener
		parking.unregister(listener);

		// add another car, which will not print the name, since the listener
		// has been previously unregistered
		parking.addCar(new Car("dacia"));
	}
}
