package com.sda.patterns.behavioral.templatemethod.challenge;

public class Client {

    public static void main(String[] args) {
        HouseTemplate woodHouse = new WoodHouse();
        woodHouse.buildHouse();

        System.out.println("---");

        HouseTemplate stoneHouse = new StoneHouse();
        stoneHouse.buildHouse();
    }
}
