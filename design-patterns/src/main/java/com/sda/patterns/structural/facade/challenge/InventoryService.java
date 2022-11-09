package com.sda.patterns.structural.facade.challenge;

public class InventoryService {

	public boolean isAvailable(Product product) {
		System.out.println("check Warehouse database for product availability");
		return true;
	}
}
