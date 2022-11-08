package com.sda.patterns.structural.decorator.ex2;

public class TextDecorators {

	public static String uppercase(String input) {
		return input.toUpperCase();
	}

	public static String quotes(String input) {
		return "'" + input + "'";
	}
}
