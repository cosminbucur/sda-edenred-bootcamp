package com.sda.patterns.structural.decorator.challenge;

public class SportsCar extends CarDecorator {

	public SportsCar(Car car) {
		super(car);
	}

	@Override
	public void assemble() {
		car.assemble();
		System.out.println("add sport components");
	}
}
