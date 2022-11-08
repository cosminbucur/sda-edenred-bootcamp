package com.sda.patterns.structural.decorator.challenge;

public class LuxuryCar extends CarDecorator {

	public LuxuryCar(Car car) {
		super(car);
	}

	@Override
	public void assemble() {
		car.assemble();
		System.out.println("add luxury components");
	}
}
