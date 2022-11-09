package com.sda.cleancode.fluent.ex1;

public class VeganRestaurant implements Restaurant {

    String name;

    @Override
    public Restaurant name(String name) {
        this.name = name;
        return this;
    }

    @Override
    public Menu show() {
        MenuHandler handler = new MenuHandler();
        handler.showMenu();
        return handler;
    }
}
