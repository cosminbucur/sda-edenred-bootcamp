package com.sda.patterns.structural.decorator.challenge;

public class StandardCar implements Car {

	@Override
	public void assemble() {
		System.out.println("add standard components");
	}
}
