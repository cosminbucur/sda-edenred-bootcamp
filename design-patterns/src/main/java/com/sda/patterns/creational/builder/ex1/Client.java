package com.sda.patterns.creational.builder.ex1;

public class Client {

	public static void main(String[] args) {
		HouseBuilder brickHouseBuilder = new BrickHouseBuilder();
		Pig brickPig = new Pig(brickHouseBuilder);
		House brickHouse = brickPig.build();
		System.out.println(brickHouse);

		HouseBuilder strawHouseBuilder = new StrawHouseBuilder();
		Pig strawPig = new Pig(strawHouseBuilder);
		House strawHouse = strawPig.build();
		System.out.println(strawHouse);
	}
}
