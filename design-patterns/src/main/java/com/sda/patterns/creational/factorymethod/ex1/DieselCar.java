package com.sda.patterns.creational.factorymethod.ex1;

public class DieselCar extends Car {

	public DieselCar() {
		super(CarType.DIESEL);
	}

	@Override
	void build() {
		System.out.println("build diesel car");
	}
}
