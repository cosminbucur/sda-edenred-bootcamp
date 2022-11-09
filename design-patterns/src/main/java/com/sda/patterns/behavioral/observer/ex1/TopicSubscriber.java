package com.sda.patterns.behavioral.observer.ex1;

public class TopicSubscriber implements Observer {

	private String name;

	// optional
	private Subject topic;

	public TopicSubscriber(String name) {
		this.name = name;
	}

	@Override
	public void update() {
		String message = this.topic.getUpdate(this);

		if (message == null) {
			System.out.println("no new message");
		} else {
			System.out.println(this.name + " - consume message: " + message);
		}
	}

	@Override
	public void setSubject(Subject subject) {
		this.topic = subject;
	}
}
