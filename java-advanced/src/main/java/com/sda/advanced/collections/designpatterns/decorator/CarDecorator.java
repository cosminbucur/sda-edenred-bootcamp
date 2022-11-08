package com.sda.advanced.collections.designpatterns.decorator;


public abstract class CarDecorator implements Car{

    Car car;

    CarDecorator(Car car){
        this.car = car;
    }

    public abstract void assemble();

}
