package com.sda.fundamentals;

import java.util.HashSet;
import java.util.Set;

public class Car implements Comparable<Car> {
    private int fabricationYear;

    private Car(int fabricationYear) {
        this.fabricationYear = fabricationYear;
    }

    @Override
    public int compareTo(Car car) {
        //Car.compareTo(Car)
        if(car.fabricationYear < this.fabricationYear){
            return -1;
        }
        else if(car.fabricationYear > this.fabricationYear){
            return 1;
        }
        return 0;

    }

    public static void main(String[] args) {
    Car car = new Car(123);
    Set<Car> cars = new HashSet<>();
    cars.add(new Car(1984));
    cars.add(new Car(1991));
    cars.add(new Car(2003));
        System.out.println(car.compareTo(new Car(1984)));
    }


}
