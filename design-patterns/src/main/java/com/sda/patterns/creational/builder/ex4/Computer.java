package com.sda.patterns.creational.builder.ex4;

public class Computer {

	// required parameters
	private String cpu;
	private String hdd;

	// optional parameters
	private String graphicsCard;


	private Computer(ComputerBuilder builder) {
		this.cpu = builder.cpu;
		this.hdd = builder.hdd;
		this.graphicsCard = builder.graphicsCard;
	}

	public String getCpu() {
		return cpu;
	}

	public String getHdd() {
		return hdd;
	}

	public String getGraphicsCard() {
		return graphicsCard;
	}

	@Override
	public String toString() {
		return "Computer{" +
				"cpu='" + cpu + '\'' +
				", hdd='" + hdd + '\'' +
				", graphicsCard='" + graphicsCard + '\'' +
				'}';
	}

	public static class ComputerBuilder {

		// required parameters
		private String cpu;
		private String hdd;

		// optional parameters
		private String graphicsCard;

		public ComputerBuilder(String cpu, String hdd) {
			this.cpu = cpu;
			this.hdd = hdd;
		}

		public ComputerBuilder setGraphicsCard(String graphicsCard) {
			this.graphicsCard = graphicsCard;
			return this;
		}

		public Computer build() {
			return new Computer(this);
		}

	}
}
