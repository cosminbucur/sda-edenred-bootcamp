package com.sda.patterns.creational.factorysimple.ex2;

public class Client {

	public static void main(String[] args) {
		Apple apple = FruitFactory.createApple();
		System.out.println(apple);
		Orange orange = FruitFactory.createOrange();
		System.out.println(orange);
	}
}
