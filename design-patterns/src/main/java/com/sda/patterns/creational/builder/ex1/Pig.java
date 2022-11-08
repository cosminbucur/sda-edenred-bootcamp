package com.sda.patterns.creational.builder.ex1;

public class Pig {

	private HouseBuilder houseBuilder;

	public Pig(HouseBuilder houseBuilder) {
		this.houseBuilder = houseBuilder;
	}

	public House build() {
		this.houseBuilder.buildFoundation();
		this.houseBuilder.buildStructure();
		this.houseBuilder.buildRoof();
		return this.houseBuilder.getHouse();
	}
}
