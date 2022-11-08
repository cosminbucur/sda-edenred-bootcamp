package com.sda.patterns.creational.builder.ex1;

public class StrawHouseBuilder implements HouseBuilder {

	private final House house = new House();

	@Override
	public void buildFoundation() {
		this.house.setFoundation("straw foundation");
	}

	@Override
	public void buildStructure() {
		this.house.setStructure("straw structure");
	}

	@Override
	public void buildRoof() {
		this.house.setRoof("straw roof");
	}

	@Override
	public House getHouse() {
		return house;
	}
}
