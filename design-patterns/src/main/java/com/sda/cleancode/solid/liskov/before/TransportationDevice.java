package com.sda.cleancode.solid.liskov.before;

public class TransportationDevice {

	private String name;
	private double speed;
	private Engine engine;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	void startEngine() {
	}
}
