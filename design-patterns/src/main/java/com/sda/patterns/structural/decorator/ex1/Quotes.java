package com.sda.patterns.structural.decorator.ex1;

public class Quotes extends TextDecorator {

	public Quotes(Text text) {
		super(text);
	}

	@Override
	public String format(String string) {
		return "'" + text.format(string) + "'";
	}
}
