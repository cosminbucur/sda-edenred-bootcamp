package com.sda.patterns.creational.factoryabstract.challenge;

public class Client {

	public static void main(String[] args) {
		Processor hpProcessor = createLaptop(new HpLaptop(1024));
		hpProcessor.printSpecs();

		System.out.println("---");
		Processor appleProcessor = createLaptop(new AppleLaptop(512));
		appleProcessor.printSpecs();
	}

	public static Processor createLaptop(LaptopFactory laptopFactory) {
		Processor processor = laptopFactory.createProcessor();
		Storage storage = laptopFactory.createStorage();
		processor.attachStorage(storage);
		return processor;
	}
}
