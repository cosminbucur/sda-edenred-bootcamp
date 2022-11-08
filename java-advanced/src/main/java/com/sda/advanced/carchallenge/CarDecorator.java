package com.sda.advanced.carchallenge;

public abstract class CarDecorator implements Car {
    protected Car car;
    public CarDecorator(Car car) {
    this.car = car;
    }
     public abstract void assemble();


}
