package com.sda.patterns.creational.factorystaticmethod.ex1.before;

public class Client {

	public static void main(String[] args) {
		Time time1 = new Time(2);
		Time time2 = new Time(0, 2);
		Time time3 = new Time(0, 0, 2);
	}
}
