package com.sda.patterns.structural.facade.challenge;

public class ShippingService {

	public void shipProduct(Product product) {
		System.out.println("connect with external shipment service to ship product");
		System.out.println(product + " shipped");
	}
}
