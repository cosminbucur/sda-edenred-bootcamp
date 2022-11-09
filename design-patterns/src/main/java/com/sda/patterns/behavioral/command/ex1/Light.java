package com.sda.patterns.behavioral.command.ex1;

// receiver
public class Light {
    public void turnOn() {
        System.out.println("Light is on ");
    }

    public void turnOff() {
        System.out.println("Light is off");
    }
}
