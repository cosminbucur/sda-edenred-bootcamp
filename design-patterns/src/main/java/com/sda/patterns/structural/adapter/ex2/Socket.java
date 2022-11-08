package com.sda.patterns.structural.adapter.ex2;

public class Socket {

	public Voltage getVoltage() {
		return new Voltage(220);
	}
}
