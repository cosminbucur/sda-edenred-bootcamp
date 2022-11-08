package com.sda.patterns.creational.builder.ex4;

public class Client {

	public static void main(String[] args) {

		Computer computer = new Computer.ComputerBuilder("amd", "seagate")
				.setGraphicsCard("nvidia")
				.build();
		System.out.println(computer);
	}
}
