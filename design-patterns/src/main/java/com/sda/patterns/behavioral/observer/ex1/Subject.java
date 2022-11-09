package com.sda.patterns.behavioral.observer.ex1;

public interface Subject {

	void register(Observer obs);

	void unregister(Observer obs);

	void notifyObservers();

	String getUpdate(Observer obs);
}
