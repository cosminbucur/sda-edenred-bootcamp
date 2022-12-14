package com.sda.cleancode.solid.openclosed.before;

public class SimpleCalculator implements Calculator {

	@Override
	public void calculate(Operation operation) {
		if (operation == null) {
			throw new IllegalArgumentException("some message");
		}

		// if a new operation is needed, should make changes here
		if (operation instanceof Addition) {
			Addition addition = (Addition) operation;
			addition.setResult(addition.getFirstOperand() + addition.getSecondOperand());
		} else if (operation instanceof Subtraction) {
			Subtraction subtraction = (Subtraction) operation;
			subtraction.setResult(subtraction.getFirstOperand() - subtraction.getSecondOperand());
		}
	}
}
