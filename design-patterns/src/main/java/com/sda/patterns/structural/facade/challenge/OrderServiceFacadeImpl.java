package com.sda.patterns.structural.facade.challenge;

public class OrderServiceFacadeImpl implements OrderServiceFacade {

	private InventoryService inventoryService;
	private PaymentService paymentService;
	private ShippingService shippingService;

	public OrderServiceFacadeImpl(InventoryService inventoryService, PaymentService paymentService, ShippingService shippingService) {
		this.inventoryService = inventoryService;
		this.paymentService = paymentService;
		this.shippingService = shippingService;
	}

	@Override
	public boolean placeOrder(Long productId) {
		boolean orderCompleted = false;
		Product product = new Product();
		product.setProductId(productId);

		if (inventoryService.isAvailable(product)) {
			System.out.println("Product with id: " + product.getProductId() + " is available.");

			boolean paymentConfirmed = paymentService.makePayment();

			if (paymentConfirmed) {
				System.out.println("Payment confirmed...");

				shippingService.shipProduct(product);
				System.out.println("Product shipped...");

				orderCompleted = true;
			}
		}
		return orderCompleted;
	}
}
