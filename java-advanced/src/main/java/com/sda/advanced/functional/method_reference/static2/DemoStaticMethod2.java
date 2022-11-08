package com.sda.advanced.functional.method_reference.static2;

import java.util.Arrays;
import java.util.List;

public class DemoStaticMethod2 {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(6, 12, 40, 18, 33, 24, 40);

		// lambda
		Numbers.findNumbers(numbers, (first, second) -> Numbers.sumGreaterThan100(first, second));

		// method reference
		Numbers.findNumbers(numbers, Numbers::sumGreaterThan100)
				.forEach(System.out::println);
	}
}
