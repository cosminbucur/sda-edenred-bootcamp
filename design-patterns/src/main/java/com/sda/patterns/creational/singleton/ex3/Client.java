package com.sda.patterns.creational.singleton.ex3;

public class Client {

	public static void main(String[] args) {
		LazyInitializedSingleton lazyInitializedSingleton =
				LazyInitializedSingleton.getInstance();
		System.out.println(lazyInitializedSingleton);
	}
}
