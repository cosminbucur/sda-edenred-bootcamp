package com.sda.patterns.structural.adapter.ex2;

public class SocketClassAdapter extends Socket implements SocketAdapter {

	@Override
	public Voltage get220Voltage() {
		return getVoltage();
	}

	@Override
	public Voltage get110Volt() {
		Voltage voltage = getVoltage();
		return convertVoltage(voltage, 2);
	}

	private Voltage convertVoltage(Voltage voltage, int i) {
		return new Voltage(voltage.getVolts() / i);
	}

}
