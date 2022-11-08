package com.sda.advanced.collections.designpatterns.decorator;

public class StandardCar implements Car{
    @Override
    public void assemble() {
        System.out.println("Standard Car");
    }
}
