package com.sda.advanced.collections.designpatterns.builder;

public interface HouseBuilder {

    abstract void buildFundation();
    void buildStructure();
    void buildRoof();

    House getHouse();
}
