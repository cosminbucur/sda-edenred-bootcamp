package com.sda.patterns.behavioral.command.ex1;

public class FanOn implements Command {

    private final Fan fan;

    public FanOn(Fan fan) {
        this.fan = fan;
    }

    public void execute() {
        fan.startRotate();
    }
}
