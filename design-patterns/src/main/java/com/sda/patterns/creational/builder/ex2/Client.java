package com.sda.patterns.creational.builder.ex2;

public class Client {

	public static void main(String[] args) {
		Address address = new AddressBuilder()
				.withState("state")
				.withCity("city")
				.withStreet("street")
				.withZip("pin")
				.build();

		Person person = new PersonBuilder()
				.withFirstName("firstName")
				.withLastName("lastName")
				.withIsEmployed(false)
				.withAddress(address)
				.build();

		System.out.println(person);
	}
}
