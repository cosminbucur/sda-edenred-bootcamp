

package com.sda.patterns.creational.factorystaticmethod.ex1.after;

public class Client {

	public static void main(String[] args) {
		Time time1 = TimeFactory.fromSeconds(2);
		Time time2 = TimeFactory.fromMinutes(2);
		Time time3 = TimeFactory.fromHours(2);

		System.out.println(time1);
		System.out.println(time2);
		System.out.println(time3);
	}
}
