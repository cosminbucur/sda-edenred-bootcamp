package com.sda.patterns.structural.decorator.challenge;

public class Client {

	public static void main(String[] args) {
		Car sportsCar = new SportsCar(new StandardCar());
		sportsCar.assemble();
		System.out.println("------");
		Car luxuryCar = new LuxuryCar(new SportsCar(new StandardCar()));
		luxuryCar.assemble();
	}
}
