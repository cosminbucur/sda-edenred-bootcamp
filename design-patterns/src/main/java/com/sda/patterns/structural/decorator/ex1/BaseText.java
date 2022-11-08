package com.sda.patterns.structural.decorator.ex1;

public class BaseText implements Text {

	@Override
	public String format(String input) {
		return input;
	}
}
