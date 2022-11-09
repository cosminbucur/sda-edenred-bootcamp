package com.sda.patterns.behavioral.templatemethod.ex1;

public class StoreOrder extends OrderTemplate {

	@Override
	public void selectItem() {
		System.out.println("customer picks up item");
	}

	@Override
	public void pay() {
		System.out.println("pay with cash");
	}

	@Override
	public void deliver() {
		System.out.println("handover to customer");
	}
}
