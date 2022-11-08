package com.sda.patterns.creational.factorymethod.ex1;

public class ElectricCar extends Car {

	public ElectricCar() {
		super(CarType.ELECTRIC);
	}

	@Override
	void build() {
		System.out.println("build electric car");
	}
}
