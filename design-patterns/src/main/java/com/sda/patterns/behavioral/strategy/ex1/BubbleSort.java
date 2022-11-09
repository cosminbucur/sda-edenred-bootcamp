package com.sda.patterns.behavioral.strategy.ex1;

import java.util.List;

public class BubbleSort implements SortStrategy {

	@Override
	public void sort(List<String> list) {
		System.out.println("List sorted using Bubble sort implementation");
	}
}