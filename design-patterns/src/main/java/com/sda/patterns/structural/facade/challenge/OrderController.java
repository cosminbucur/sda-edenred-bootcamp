package com.sda.patterns.structural.facade.challenge;

public class OrderController {

	private OrderServiceFacade facade;

	public boolean orderProduct(Long productId) {
		System.out.println("controller: order completed");
		return facade.placeOrder(productId);
	}
}
