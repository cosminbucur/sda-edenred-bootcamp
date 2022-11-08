package com.sda.patterns.creational.builder.ex2;

public class Person {

	private final String firstName;
	private final String lastName;
	private final Address address;
	private final boolean isEmployed;

	public Person(String firstName, String lastName, Address address, boolean isEmployed) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.isEmployed = isEmployed;
	}
}