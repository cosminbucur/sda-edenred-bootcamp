package com.sda.patterns.structural.decorator.ex1;

public abstract class TextDecorator implements Text {

	Text text;

	public TextDecorator(Text text) {
		this.text = text;
	}

	public abstract String format(String string);
}
