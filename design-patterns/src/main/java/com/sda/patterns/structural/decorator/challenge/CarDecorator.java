package com.sda.patterns.structural.decorator.challenge;

public abstract class CarDecorator implements Car {

	Car car;

	public CarDecorator(Car car) {
		this.car = car;
	}

	public abstract void assemble();
}
