package com.sda.advanced.carchallenge;

public class LuxuryCar extends  CarDecorator{

    public LuxuryCar(Car car) {
        super(car);
    }

    @Override
    public void assemble() {
        super.car.assemble();
        System.out.println("assembled luxury car");
    }
}
