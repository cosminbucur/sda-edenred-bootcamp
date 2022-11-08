package com.sda.patterns.creational.factorysimple.ex2;

public class FruitFactory {

	private FruitFactory() {
	}

	public static Apple createApple() {
		return new Apple();
	}

	public static Orange createOrange() {
		return new Orange();
	}
}
