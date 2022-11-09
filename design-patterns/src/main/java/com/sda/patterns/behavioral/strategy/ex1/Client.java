package com.sda.patterns.behavioral.strategy.ex1;

import java.util.List;

public class Client {

	public static void main(String[] args) {
		List<String> list = List.of("b", "a", "c");
		Context context = new Context(new BubbleSort(), new BinarySearch());

		context.sort(list);
		context.search("b");

		System.out.println("---");

		context.setSortStrategy(new QuickSort());
		context.setSearchStrategy(new LinearSearch());
		context.sort(list);
		context.search("a");
	}
}
