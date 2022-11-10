package com.sda.advanced.concurrency.synchronize.volatiles;

public class DemoVolatile2 {

	// used to make classes thread safe (synchronize)
	// used to modify the value by different threads
	// read / write will be done from and to the main memory


	// x = x + 1 or x++ is a compound read-modify-write sequence
	private static volatile int CONSTANT = 0;

	// changes made in one thread might not reflect immediately in other thread
//	private static int CONSTANT = 0;

	public static void main(String[] args) {
		Listener listener = new Listener();
		Incrementer incrementer = new Incrementer();

		listener.start();
		incrementer.start();
	}

	static class Listener extends Thread {
		@Override
		public void run() {
			int localValue = CONSTANT;
			while (localValue < 5) {
				if (localValue != CONSTANT) {
					System.out.println("value changed " + CONSTANT);
					localValue = CONSTANT;
				}
			}
		}
	}

	static class Incrementer extends Thread {
		@Override
		public void run() {
			int localValue = CONSTANT;
			while (CONSTANT < 5) {
				System.out.println("incrementing value " + (localValue + 1));
				CONSTANT = ++localValue;
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}