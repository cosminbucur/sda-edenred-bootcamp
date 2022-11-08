package com.sda.patterns.creational.builder.ex2;

public class Address {

	private final String city;
	private final String state;
	private final String street;
	private final String zip;

	public Address(String city, String state, String street, String zip) {
		this.city = city;
		this.state = state;
		this.street = street;
		this.zip = zip;
	}
}
