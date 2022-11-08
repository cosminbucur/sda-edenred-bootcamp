package com.sda.patterns.creational.factorysimple.ex1;

public class Client {

	public static void main(String[] args) {

		TVSimpleFactory.getTV(TVMode.LED).createTV();
	}
}
