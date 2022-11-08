package com.sda.advanced.collections.designpatterns.builder;

public class StrawHouseBuilder implements HouseBuilder{
    @Override
    public void buildFundation() {
        System.out.println("Built Fundation");
    }

    @Override
    public void buildStructure() {
        System.out.println("built structure");
    }

    @Override
    public void buildRoof() {
        System.out.println("built roof");
    }

    @Override
    public House getHouse() {
        return null;
    }
}
