package com.sda.advanced.builder;

public class BrickHouseBuilder implements HouseBuilder{
    private House house;
    @Override
    public void buildFoundation() {
        System.out.println("Building BrickHouse Foundation");
    }

    @Override
    public void buildStructure() {
        System.out.println("Building BrickHouse Structure");
    }

    @Override
    public void buildRoof() {
        System.out.println("Building BrickHouse Roof");
    }

    public House getHouse() {
        return house;
    }
}
