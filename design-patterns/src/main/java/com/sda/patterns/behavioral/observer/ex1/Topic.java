package com.sda.patterns.behavioral.observer.ex1;

import java.util.ArrayList;
import java.util.List;

public class Topic implements Subject {

	private List<Observer> observers;
	private String message;
	private boolean changed;

	public Topic() {
		this.observers = new ArrayList<>();
	}

	@Override
	public void register(Observer obs) {
		if (obs == null) {
			throw new NullPointerException("null observer");
		}
		if (!observers.contains(obs)) {
			observers.add(obs);
		}
	}

	@Override
	public void unregister(Observer obs) {
		observers.remove(obs);
	}

	@Override
	public void notifyObservers() {
		List<Observer> observersLocal;

		if (!this.changed) return;

		observersLocal = new ArrayList<>(this.observers);
		this.changed = false;

		observersLocal.forEach(observer -> observer.update());
	}

	@Override
	public String getUpdate(Observer observer) {
		return this.message;
	}

	// change state
	public void postMessage(String message) {
		System.out.println("message posted to topic: " + message);

		this.message = message;
		this.changed = true;

		notifyObservers();
	}
}
