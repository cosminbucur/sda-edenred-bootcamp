package com.sda.patterns.creational.factorystaticmethod.ex2;

public class Client {

	public static void main(String[] args) {
		Profile defaultProfile = Profile.createDefault("email", "pass");
		System.out.println(defaultProfile);

		Profile profile = Profile.createWithLogging("email", "profile", "avatar");
		System.out.println(profile);
	}
}
