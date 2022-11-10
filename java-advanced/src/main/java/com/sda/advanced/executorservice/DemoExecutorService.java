package com.sda.advanced.executorservice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DemoExecutorService {

	public static void main(String[] args) {
		// create task
		Runnable task = () -> {
			System.out.println(Thread.currentThread().getName());
		};

		// create executor service
		ExecutorService executorService = Executors.newSingleThreadExecutor();

		// submit task
		executorService.submit(task);

		// shutdown
		executorService.shutdown();
	}
}
