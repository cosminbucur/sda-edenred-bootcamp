package com.sda.patterns.structural.adapter.ex3;

public class MovableAdapterImpl implements MovableAdapter {

	private Movable movable;

	public MovableAdapterImpl(Movable movable) {
		this.movable = movable;
	}

	@Override
	public double getSpeed() {
		return convertMPHtoKMPH(movable.getSpeed());
	}

	private double convertMPHtoKMPH(double mph) {
		return mph * 1.60934;
	}
}