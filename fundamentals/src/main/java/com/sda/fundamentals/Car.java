package com.sda.fundamentals;

public class Car implements Comparable<Car>{
    private int fabricationYear;

    Car(int fabricationYear){
        this.fabricationYear = fabricationYear;
    }

    public int getFabricationYear() {
        return fabricationYear;
    }

    public void setFabricationYear(int fabricationYear) {
        this.fabricationYear = fabricationYear;
    }


    @Override
    public int compareTo(Car o) {
        return this.fabricationYear - o.getFabricationYear();
    }

}
