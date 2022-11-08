package com.sda.patterns.structural.adapter.ex2;

public class Client {

	public static void main(String[] args) {
		SocketAdapter socketAdapter = new SocketClassAdapter();
		Voltage regularVoltage = socketAdapter.get220Voltage();
		System.out.println(regularVoltage);

		System.out.println("---");

		Voltage smallVoltage = socketAdapter.get110Volt();
		System.out.println(smallVoltage);
	}

}
