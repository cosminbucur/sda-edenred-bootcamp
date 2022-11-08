package com.sda.patterns.structural.decorator.ex1;

public class Uppercase extends TextDecorator {

	public Uppercase(Text text) {
		super(text);
	}

	@Override
	public String format(String string) {
		return text.format(string).toUpperCase();
	}
}
