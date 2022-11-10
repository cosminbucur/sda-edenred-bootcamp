package com.sda.advanced.executorservice;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class DemoPeriodicSchedule {

	public static void main(String[] args) {
		ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(3);

		Runnable task = () -> {
			System.out.println("Executing Task At " + System.nanoTime());
		};

		scheduledExecutorService.scheduleAtFixedRate(task, 0, 2, TimeUnit.SECONDS);
	}
}
