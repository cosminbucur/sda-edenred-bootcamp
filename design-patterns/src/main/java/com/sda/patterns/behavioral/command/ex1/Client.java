package com.sda.patterns.behavioral.command.ex1;

public class Client {

    public static void main(String[] args) {
        Light light = new Light();
        LightOn lightOn = new LightOn(light);
        LightOff lightOff = new LightOff(light);

        Switch lightSwitch = new Switch(lightOn, lightOff);
        lightSwitch.flipUp();
        lightSwitch.flipDown();

        Fan fan = new Fan();
        FanOn fanOn = new FanOn(fan);
        FanOff fanOff = new FanOff(fan);

        Switch fanSwitch = new Switch(fanOn, fanOff);
        fanSwitch.flipUp();
        fanSwitch.flipDown();
    }
}
