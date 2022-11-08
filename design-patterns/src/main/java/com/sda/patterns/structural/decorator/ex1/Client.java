package com.sda.patterns.structural.decorator.ex1;

public class Client {

	public static void main(String[] args) {
		Text baseText = new BaseText();
		Text result = new Uppercase(new Quotes(baseText));
		System.out.println(result.format("input text"));
	}
}
