package com.sda.patterns.creational.builder.challenge;

import java.util.function.Consumer;

public class Robot {

	private final String id;
	private final String brand;
	private final String model;

	public Robot(Builder builder) {
		this.id = builder.id;
		this.brand = builder.brand;
		this.model = builder.model;
	}

	public String getId() {
		return id;
	}

	public String getBrand() {
		return brand;
	}

	public String getModel() {
		return model;
	}

	@Override
	public String toString() {
		return "Robot{" +
				"id='" + id + '\'' +
				", brand='" + brand + '\'' +
				", model='" + model + '\'' +
				'}';
	}

	public static class Builder {

		private String id;
		private String brand;
		private String model;

		public Builder() {
		}

		public static Robot with(Consumer<Builder> builderConsumer) {
			Builder builder = new Builder();
			builderConsumer.accept(builder);
			return builder.build();
		}

		public void setId(String id) {
			this.id = id;
		}

		public void setBrand(String brand) {
			this.brand = brand;
		}

		public void setModel(String model) {
			this.model = model;
		}

		private Robot build() {
			return new Robot(this);
		}
	}
}
