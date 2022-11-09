package com.sda.patterns.structural.facade.challenge;

public class Client {

	public static void main(String[] args) {
		InventoryService inventoryService = new InventoryService();
		PaymentService paymentService = new PaymentService();
		ShippingService shippingService = new ShippingService();

		Product product = new Product(1L, "laptop");

		OrderServiceFacade facade =
				new OrderServiceFacadeImpl(inventoryService, paymentService, shippingService);

		facade.placeOrder(product.getProductId());
	}
}
