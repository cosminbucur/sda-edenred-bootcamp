package com.sda.cleancode.solid.openclosed.after;

public class SimpleCalculator implements Calculator {

	@Override
	public void calculate(Operation operation) {
		if (operation == null) {
			throw new IllegalArgumentException("some message");
		}

		operation.performOperation();
	}
}
