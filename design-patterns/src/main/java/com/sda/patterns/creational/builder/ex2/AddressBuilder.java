package com.sda.patterns.creational.builder.ex2;

public class AddressBuilder {

	private String city;
	private String state;
	private String street;
	private String zip;

	public AddressBuilder withCity(String city) {
		this.city = city;
		return this;
	}

	public AddressBuilder withState(String state) {
		this.state = state;
		return this;
	}

	public AddressBuilder withStreet(String street) {
		this.street = street;
		return this;
	}

	public AddressBuilder withZip(String zip) {
		this.zip = zip;
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
