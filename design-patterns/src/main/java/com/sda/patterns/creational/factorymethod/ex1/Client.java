package com.sda.patterns.creational.factorymethod.ex1;

public class Client {

	public static void main(String[] args) {
		Car electricCar = CarFactory.buildCar(CarType.ELECTRIC);
		System.out.println(electricCar);

		Car dieselCar = CarFactory.buildCar(CarType.DIESEL);
		System.out.println(dieselCar);

		Car electricCar1 = CarLambdaFactory.buildCar(CarType.ELECTRIC);
		System.out.println(electricCar1);

		Car dieselCar1 = CarLambdaFactory.buildCar(CarType.DIESEL);
		System.out.println(dieselCar1);

		Car electricCar2 = CarLambdaFactory2.buildCar(CarType.ELECTRIC);
		System.out.println(electricCar2);

		Car dieselCar2 = CarLambdaFactory2.buildCar(CarType.DIESEL);
		System.out.println(dieselCar2);
	}
}
