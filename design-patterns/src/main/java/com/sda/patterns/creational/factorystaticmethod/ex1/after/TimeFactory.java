package com.sda.patterns.creational.factorystaticmethod.ex1.after;

public class TimeFactory {

	public static Time fromSeconds(int seconds) {
		Time time = new Time();
		time.seconds = seconds;
		return time;
	}

	public static Time fromMinutes(int minutes) {
		Time time = new Time();
		time.minutes = minutes;
		return time;
	}

	public static Time fromHours(int hours) {
		Time time = new Time();
		time.hours = hours;
		return time;
	}
}
