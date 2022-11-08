package com.sda.patterns.creational.factorymethod.ex1;

public class CarFactory {

	public static Car buildCar(CarType carType) {
		switch (carType) {
			case ELECTRIC:
				return new ElectricCar();
			case DIESEL:
				return new DieselCar();
			default:
				throw new IllegalArgumentException("no such car");
		}
	}
}
