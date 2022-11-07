package com.sda.advanced.builder;

public class Pig {

   private HouseBuilder houseBuilder;

    public Pig(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }
    public House build(){
        return new House();
    }
}
