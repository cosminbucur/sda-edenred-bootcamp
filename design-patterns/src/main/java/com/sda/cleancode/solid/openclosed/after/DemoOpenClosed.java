package com.sda.cleancode.solid.openclosed.after;

// classes (or methods) should be open for extension
// once written they should only be touched to fix errors
// new functionality should go into new derived classes
public class DemoOpenClosed {

	public static void main(String[] args) {

		Operation addition = new Addition(1, 2);
		Operation subtraction = new Subraction(4, 2);
		Operation multiplication = new Multiplication(3, 3);

		Calculator calculator = new SimpleCalculator();
		calculator.calculate(addition);
		calculator.calculate(subtraction);
		calculator.calculate(multiplication);
	}
}
