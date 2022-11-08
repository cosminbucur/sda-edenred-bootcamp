package com.sda.patterns.structural.decorator.ex2;

public class Client {

	public static void main(String[] args) {
		String result = new BaseText()
				.andThen(TextDecorators::uppercase)
				.andThen(TextDecorators::quotes)
				.apply("this is some random text");
		System.out.println(result);
	}
}
