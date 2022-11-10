package com.sda.advanced.executorservice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class DemoMultipleThreads {

	public static void main(String[] args) {
		Runnable task1 = () -> {
			System.out.println("Executing Task1 inside : " + Thread.currentThread().getName());
			try {
				TimeUnit.SECONDS.sleep(2);
			} catch (InterruptedException e) {
				throw new IllegalStateException(e);
			}
		};

		Runnable task2 = () -> {
			System.out.println("Executing Task2 inside : " + Thread.currentThread().getName());
			try {
				TimeUnit.SECONDS.sleep(4);
			} catch (InterruptedException e) {
				throw new IllegalStateException(e);
			}
		};

		Runnable task3 = () -> {
			System.out.println("Executing Task3 inside : " + Thread.currentThread().getName());
			try {
				TimeUnit.SECONDS.sleep(3);
			} catch (InterruptedException e) {
				throw new IllegalStateException(e);
			}
		};

		ExecutorService executorService = Executors.newFixedThreadPool(2);

		executorService.submit(task1);
		executorService.submit(task2);
		executorService.submit(task3);

		executorService.shutdown();
	}
}
