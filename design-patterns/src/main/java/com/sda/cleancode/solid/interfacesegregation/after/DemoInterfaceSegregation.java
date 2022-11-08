package com.sda.cleancode.solid.interfacesegregation.after;

// define subsets of functionality as interfaces
public class DemoInterfaceSegregation {

	public static void main(String[] args) {
		ToyBuilder.buildToyHouse();
		ToyBuilder.buildToyCar();
		ToyBuilder.buildToyPlane();
	}
}
