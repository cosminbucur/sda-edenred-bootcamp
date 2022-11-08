package com.sda.patterns.structural.adapter.ex3;

public class Client2 {

	public static void main(String[] args) {
		// adaptee
		Movable movable = new Duster();

		// convert with adapter
		MovableAdapter movableAdapter = new MovableAdapterImpl(movable);

		//
		double speed = movableAdapter.getSpeed();
	}
}
