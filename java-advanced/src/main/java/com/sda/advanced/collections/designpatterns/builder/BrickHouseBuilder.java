package com.sda.advanced.collections.designpatterns.builder;

public class BrickHouseBuilder implements HouseBuilder{

    House house;

    public void buildFundation(){
        System.out.println("Fundation built");
    };
    public void buildStructure(){
        System.out.println("Structure built");
    };
    public void buildRoof(){
        System.out.println("Roof built");
    }

    @Override
    public House getHouse() {
        return this.house;
    }

    ;

}
