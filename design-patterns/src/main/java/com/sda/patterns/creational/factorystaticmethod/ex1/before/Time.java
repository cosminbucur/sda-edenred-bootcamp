package com.sda.patterns.creational.factorystaticmethod.ex1.before;

public class Time {

	int seconds;
	int minutes;
	int hours;

	Time(int seconds) {
		this.seconds = seconds;
	}

	Time(int minutes, int seconds) {
		this.minutes = minutes;
		this.seconds = seconds;
	}

	Time(int hours, int minutes, int seconds) {
		this.hours = hours;
		this.minutes = minutes;
		this.seconds = seconds;
	}
}
