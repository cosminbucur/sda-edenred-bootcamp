package com.sda.advanced.collections.designpatterns.decorator;

public class SportsCar extends CarDecorator{

    SportsCar(Car car) {
        super(car);
    }

    public void assemble(){
        car.assemble();
        System.out.println("Add Spoiler");
    }
}
