package com.sda.advanced.collections.designpatterns.decorator;

public class LuxuryCar extends CarDecorator{
    LuxuryCar(Car car) {
        super(car);
    }

    public void assemble(){
        car.assemble();
        System.out.println("Add Leather Seats");
    }
}
