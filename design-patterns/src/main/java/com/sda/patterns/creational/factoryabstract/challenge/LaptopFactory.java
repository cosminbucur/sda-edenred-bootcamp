package com.sda.patterns.creational.factoryabstract.challenge;

public interface LaptopFactory {

	Processor createProcessor();

	Storage createStorage();
}
