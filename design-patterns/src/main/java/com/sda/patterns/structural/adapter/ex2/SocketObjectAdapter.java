package com.sda.patterns.structural.adapter.ex2;

public class SocketObjectAdapter implements SocketAdapter {

	private Socket socket = new Socket();

	@Override
	public Voltage get220Voltage() {
		return socket.getVoltage();
	}

	@Override
	public Voltage get110Volt() {
		Voltage voltage = socket.getVoltage();
		return convertVoltage(voltage, 2);
	}

	private Voltage convertVoltage(Voltage voltage, int i) {
		return new Voltage(voltage.getVolts() / i);
	}

}
