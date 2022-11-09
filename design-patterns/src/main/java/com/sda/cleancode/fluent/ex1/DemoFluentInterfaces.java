package com.sda.cleancode.fluent.ex1;

public class DemoFluentInterfaces {

    public static void main(String[] args) {
        new VeganRestaurant()
                .name("test")
                .show()
                .order(0)
                .order(1)
                .eat()
                .pay();
    }
}
