package com.sda.advanced.collections.designpatterns.builder;

public class Pig {
    private HouseBuilder houseBuilder;


    Pig(HouseBuilder houseBuilder){
        this.houseBuilder = houseBuilder;
    }

    public House build(){
        this.houseBuilder.buildFundation();
        this.houseBuilder.buildStructure();
        this.houseBuilder.buildRoof();
        return this.houseBuilder.getHouse();
    };
}
