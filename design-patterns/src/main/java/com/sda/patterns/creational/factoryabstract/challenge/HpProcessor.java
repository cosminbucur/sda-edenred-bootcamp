package com.sda.patterns.creational.factoryabstract.challenge;

public class HpProcessor implements Processor {
	private String storage;

	public HpProcessor() {
		System.out.println("AMD Processor will be used for Hp Laptop");
	}

	// This method will attach Storage Object with Processor
	public void attachStorage(Storage storage) {
		this.storage = storage.toString();
		System.out.println(storage + " is attached to Hp Laptop");
	}

	public void printSpecs() {
		System.out.println(this.toString());
	}

	@Override
	public String toString() {
		return "HpProcessor is created using AMD Processor and " + this.storage;
	}
}
