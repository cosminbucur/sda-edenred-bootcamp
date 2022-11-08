package com.sda.patterns.creational.builder.challenge;

public class Client {

	public static void main(String[] args) {
		Robot fullRobot = Robot.Builder.with(
				r -> {
					r.setId("123");
					r.setBrand("toshiba");
					r.setModel("X200");
				}
		);

		System.out.println(fullRobot);

		Robot simpleRobot = Robot.Builder.with(
				r -> r.setBrand("toshiba")
		);
		System.out.println(simpleRobot);
	}
}
