package com.sda.patterns.creational.singleton.ex5;

// https://en.wikipedia.org/wiki/William_Pugh_(computer_scientist)
public class BillPughSingleton {

	private BillPughSingleton() {
	}

	public static BillPughSingleton getInstance() {
		return SingletonHelper.INSTANCE;
	}

	// contains the instance of the singleton class
	// when the class is loaded, the helper class is not loaded
	// only when you call getInstance it will load
	private static class SingletonHelper {
		private static final BillPughSingleton INSTANCE = new BillPughSingleton();
	}
}
