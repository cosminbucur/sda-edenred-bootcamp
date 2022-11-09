package com.sda.patterns.behavioral.state.challenge;

public class Context {

	private PackageState currentState;
	private String packageId;

	public Context(PackageState currentState, String packageId) {
		this.currentState = currentState;
		this.packageId = packageId;

		if (currentState == null) {
			this.currentState = Prepared.getInstance();
		}
	}

	public void update() {
		this.currentState.updateState(this);
	}

	public PackageState getCurrentState() {
		return currentState;
	}

	public void setCurrentState(PackageState currentState) {
		this.currentState = currentState;
	}

	public String getPackageId() {
		return packageId;
	}

	public void setPackageId(String packageId) {
		this.packageId = packageId;
	}
}
