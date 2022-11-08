package com.sda.patterns.creational.builder.ex3;

import java.util.function.Consumer;

public class PersonBuilder {

	public String firstName;
	public String lastName;

	public Address address;
	public boolean isEmployed;

	public PersonBuilder with(Consumer<PersonBuilder> builderFunction) {
		builderFunction.accept(this);
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
