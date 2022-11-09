package com.sda.patterns.behavioral.observer.ex1;

public class Client {

	public static void main(String[] args) {
		Topic topic = new Topic();

		TopicSubscriber observer1 = new TopicSubscriber("ana");
		TopicSubscriber observer2 = new TopicSubscriber("alex");
		TopicSubscriber observer3 = new TopicSubscriber("paul");

		topic.register(observer1);
		topic.register(observer2);
		topic.register(observer3);

		observer1.setSubject(topic);
		observer2.setSubject(topic);
		observer3.setSubject(topic);

		observer1.update();

		topic.postMessage("hi");
	}
}
