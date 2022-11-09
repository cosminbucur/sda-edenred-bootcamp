package com.sda.patterns.behavioral.templatemethod.ex1;

public abstract class OrderTemplate {

    // template method, final so subclasses can't override
    public final void process() {
        selectItem();
        pay();
        wrap();
        deliver();
        System.out.println("Order complete");
    }

    public abstract void selectItem();

    public abstract void pay();

    // default implementation
    public void wrap() {
        System.out.println("wrapping item");
    }

    public abstract void deliver();
}
