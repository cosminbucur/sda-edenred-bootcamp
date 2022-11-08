package com.sda.patterns.creational.singleton.ex5;

public class Client {

	public static void main(String[] args) {
		BillPughSingleton billPughSingleton = BillPughSingleton.getInstance();
		System.out.println(billPughSingleton);
	}
}
