package com.sda.advanced.builder;

public class StrawHouseBuilder implements  HouseBuilder{
    private House house;
    @Override
    public void buildFoundation() {
        System.out.println("Building StrawHouse Foundation");
    }

    @Override
    public void buildStructure() {
        System.out.println("Building StrawHouse Structure");
    }

    @Override
    public void buildRoof() {
        System.out.println("Building StrawHouse Roof");
    }

    public House getHouse() {
        return house;
    }
}
