package com.sda.advanced.carchallenge;

public class SportsCar extends CarDecorator{
    public SportsCar(Car car) {
        super(car);
    }
    @Override
    public void assemble(){
        super.car.assemble();
        System.out.println("assembled sports car");
    }
}
