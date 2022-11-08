package com.sda.patterns.creational.factorysimple.ex1;

public class LedTV implements TV {
	@Override
	public void createTV() {
		System.out.println("LET TV");
	}
}
