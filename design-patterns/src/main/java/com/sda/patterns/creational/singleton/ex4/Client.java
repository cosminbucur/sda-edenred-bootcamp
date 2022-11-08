package com.sda.patterns.creational.singleton.ex4;

public class Client {

	public static void main(String[] args) {
		ThreadSafeSingleton threadSafeSingleton = ThreadSafeSingleton.getInstance();
		System.out.println(threadSafeSingleton);
		ThreadSafeSingleton threadSafeSingleton2 = ThreadSafeSingleton.getInstanceUsingDoubleLocking();
		System.out.println(threadSafeSingleton2);
	}
}
