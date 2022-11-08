package com.sda.patterns.creational.singleton.ex2;

public class Client {

	public static void main(String[] args) {
		StaticBlockSingleton staticBlockSingleton = StaticBlockSingleton.getInstance();
		System.out.println(staticBlockSingleton);
	}
}
