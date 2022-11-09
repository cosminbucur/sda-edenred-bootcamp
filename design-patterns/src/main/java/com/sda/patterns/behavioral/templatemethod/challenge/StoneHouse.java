package com.sda.patterns.behavioral.templatemethod.challenge;

public class StoneHouse extends HouseTemplate {

    @Override
    public void buildWalls() {
        System.out.println("Building Stone Walls");
    }

    @Override
    public void buildPillars() {
        System.out.println("Building Pillars with Stone");
    }

}
