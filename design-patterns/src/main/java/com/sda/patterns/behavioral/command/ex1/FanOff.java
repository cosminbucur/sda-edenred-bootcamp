package com.sda.patterns.behavioral.command.ex1;

public class FanOff implements Command {

	private final Fan fan;

	public FanOff(Fan fan) {
		this.fan = fan;
	}

	public void execute() {
		fan.stopRotate();
	}
}
