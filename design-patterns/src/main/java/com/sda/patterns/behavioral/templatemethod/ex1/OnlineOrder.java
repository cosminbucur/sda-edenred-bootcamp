package com.sda.patterns.behavioral.templatemethod.ex1;

public class OnlineOrder extends OrderTemplate {

	@Override
	public void selectItem() {
		System.out.println("select item from site");
		System.out.println("add to cart");
	}

	@Override
	public void pay() {
		System.out.println("pay with card");
	}

	@Override
	public void deliver() {
		System.out.println("deliver by courier");
	}
}
