package com.sda.patterns.creational.factoryabstract.challenge;

public class HpLaptop implements LaptopFactory {

	private int storageSize;

	public HpLaptop(int storageSize) {
		this.storageSize = storageSize;
	}

	public Processor createProcessor() {
		return new HpProcessor();
	}

	public Storage createStorage() {
		return new HpStorage(storageSize);
	}
}