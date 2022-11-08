package com.sda.patterns.creational.builder.ex1;

public class BrickHouseBuilder implements HouseBuilder {

	private final House house = new House();

	@Override
	public void buildFoundation() {
		this.house.setFoundation("brick foundation");
	}

	@Override
	public void buildStructure() {
		this.house.setStructure("brick structure");
	}

	@Override
	public void buildRoof() {
		this.house.setRoof("brick roof");
	}

	@Override
	public House getHouse() {
		return house;
	}
}
