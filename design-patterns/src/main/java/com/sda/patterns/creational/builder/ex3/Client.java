package com.sda.patterns.creational.builder.ex3;

public class Client {

	public static void main(String[] args) {
		Address address = new AddressBuilder().with(b -> {
			b.state = "state";
			b.city = "city";
			b.street = "street";
			b.zip = "zip";
		}).build();

		Person person = new PersonBuilder().with(
				b -> {
					b.firstName = "firstName";
					b.lastName = "lastName";
					b.isEmployed = false;
					b.address = address;
				}).build();

		System.out.println(person);
	}
}
