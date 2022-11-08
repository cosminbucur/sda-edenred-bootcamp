package com.sda.patterns.creational.builder.ex2;

public class PersonBuilder {

	private String firstName;
	private String lastName;
	private Address address;
	private boolean isEmployed;

	public PersonBuilder withFirstName(String firstName) {
		this.firstName = firstName;
		return this;
	}

	public PersonBuilder withLastName(String lastName) {
		this.lastName = lastName;
		return this;
	}

	public PersonBuilder withAddress(Address address) {
		this.address = address;
		return this;
	}

	public PersonBuilder withIsEmployed(boolean isEmployed) {
		this.isEmployed = isEmployed;
		return this;
	}

	public Person build() {
		return new Person(
				firstName,
				lastName,
				address,
				isEmployed
		);
	}
}
