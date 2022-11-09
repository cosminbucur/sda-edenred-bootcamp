package com.sda.patterns.behavioral.command.ex1;

public class LightOn implements Command {

    private final Light light;

    public LightOn(Light light) {
        this.light = light;
    }

    public void execute() {
        light.turnOn();
    }
}
