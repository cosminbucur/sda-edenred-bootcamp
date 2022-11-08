package com.sda.patterns.creational.factoryabstract.challenge;

public class AppleLaptop implements LaptopFactory {
	private int storageSize;

	public AppleLaptop(int storageSize) {
		this.storageSize = storageSize;
	}

	public Processor createProcessor() {
		return new AppleProcessor();
	}

	public Storage createStorage() {
		return new AppleStorage(storageSize);
	}
}