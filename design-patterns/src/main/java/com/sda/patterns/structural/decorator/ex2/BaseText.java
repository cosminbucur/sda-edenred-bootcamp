package com.sda.patterns.structural.decorator.ex2;

import java.util.function.Function;

public class BaseText implements Function<String, String> {

	@Override
	public String apply(String input) {
		return input;
	}
}
