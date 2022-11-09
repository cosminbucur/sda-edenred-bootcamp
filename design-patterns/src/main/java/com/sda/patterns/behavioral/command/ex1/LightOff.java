package com.sda.patterns.behavioral.command.ex1;

public class LightOff implements Command {
	private Light light;

	public LightOff(Light light) {
		this.light = light;
	}

	public void execute() {
		light.turnOff();
	}
}
