package com.sda.patterns.structural.adapter.ex2;

public class Voltage {

	private int volts;

	public Voltage(int volts) {
		this.volts = volts;
	}

	public int getVolts() {
		return volts;
	}

	public void setVolts(int volts) {
		this.volts = volts;
	}

	@Override
	public String toString() {
		return "Voltage{" +
				"volts=" + volts +
				'}';
	}
}
