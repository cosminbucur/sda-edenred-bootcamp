package com.sda.patterns.structural.facade.challenge;

public class Product {

	private long productId;
	private String name;

	public Product() {
	}

	public Product(long productId, String name) {
		this.productId = productId;
		this.name = name;
	}

	public long getProductId() {
		return productId;
	}

	public void setProductId(long productId) {
		this.productId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Product{" +
				"productId=" + productId +
				", name='" + name + '\'' +
				'}';
	}
}
