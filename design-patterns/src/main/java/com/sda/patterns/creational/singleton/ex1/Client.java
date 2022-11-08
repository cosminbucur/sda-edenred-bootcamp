package com.sda.patterns.creational.singleton.ex1;

public class Client {

	public static void main(String[] args) {
		EagerInitializedSingleton eagerInitializedSingleton =
				EagerInitializedSingleton.getInstance();
		System.out.println(eagerInitializedSingleton);
	}
}
