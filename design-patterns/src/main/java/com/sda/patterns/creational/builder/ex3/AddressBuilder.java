package com.sda.patterns.creational.builder.ex3;

import java.util.function.Consumer;

public class AddressBuilder {

	public String city;
	public String state;
	public String street;
	public String zip;

	public AddressBuilder with(Consumer<AddressBuilder> builderFunction) {
		builderFunction.accept(this);
		return this;
	}

	public Address build() {
		return new Address(
				city,
				state,
				street,
				zip
		);
	}
}
