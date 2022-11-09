package com.sda.patterns.behavioral.state.ex1;

public class Context {

	private State currentState;

	public Context() {
		currentState = null;
	}

	public State getCurrentState() {
		return currentState;
	}

	public void setCurrentState(State currentState) {
		this.currentState = currentState;
	}
}
