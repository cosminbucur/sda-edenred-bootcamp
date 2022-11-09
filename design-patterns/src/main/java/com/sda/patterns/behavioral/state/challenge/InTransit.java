package com.sda.patterns.behavioral.state.challenge;

public class InTransit implements PackageState {

	private static InTransit instance = new InTransit();

	private InTransit() {
	}

	public static InTransit getInstance() {
		return instance;
	}

	@Override
	public void updateState(Context context) {
		System.out.println("package in transit");
		context.setCurrentState(Delivered.getInstance());
	}
}
