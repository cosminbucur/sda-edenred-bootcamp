package com.sda.advanced.collections.designpatterns.decorator;

public class DecoratorMain {
    public static void main(String[] args) {

        Car car = new StandardCar();
        Car tunnedCar = new LuxuryCar(new SportsCar(new StandardCar()));
        tunnedCar.assemble();

    }
}
