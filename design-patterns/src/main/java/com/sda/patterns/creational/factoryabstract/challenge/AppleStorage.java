package com.sda.patterns.creational.factoryabstract.challenge;

public class AppleStorage implements Storage {

	private int storageSize;

	public AppleStorage(int storageSize) {
		this.storageSize = storageSize;
		System.out.println(storageSize + "GB HDD will be used");
	}

	public void getType() {
		System.out.println("HDD");
	}

	@Override
	public String toString() {
		return storageSize + "GB Hard Disk";
	}
}
