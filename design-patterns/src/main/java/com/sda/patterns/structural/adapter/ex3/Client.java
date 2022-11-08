package com.sda.patterns.structural.adapter.ex3;

public class Client {

	public static void main(String[] args) {
		Duster duster = new Duster();
		double speedInMiles = duster.getSpeed();
		System.out.println(speedInMiles);

		System.out.println("---");

		MovableAdapter movableAdapter = new MovableAdapterImpl(duster);
		double speedInKms = movableAdapter.getSpeed();
		System.out.println(speedInKms);
	}

}
