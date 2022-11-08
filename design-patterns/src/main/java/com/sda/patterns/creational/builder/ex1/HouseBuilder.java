package com.sda.patterns.creational.builder.ex1;

public interface HouseBuilder {

	void buildFoundation();

	void buildStructure();

	void buildRoof();

	House getHouse();
}
