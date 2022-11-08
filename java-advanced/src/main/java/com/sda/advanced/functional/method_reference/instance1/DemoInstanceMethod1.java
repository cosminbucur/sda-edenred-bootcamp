package com.sda.advanced.functional.method_reference.instance1;

// lambda: (obj,args) -> obj.someInstanceMethod(args)
// method reference: objectType::someInstanceMethod

import java.util.List;

@FunctionalInterface
interface Jungler {

	void gank();
}

// instance of object is passed and calls to an instance method
public class DemoInstanceMethod1 {

	public static void main(String[] args) {
		Elise elise = new Elise();

		// method reference using the object of the class
		Jungler jungler = elise::stun;
		jungler.gank();
	}
}

class Elise {

	public void stun() {
		System.out.println("elise stun");
	}

	public void stun(String input) {
		System.out.println("elise stun");
	}

	public void stuff() {
		List<String> list = List.of("one", "two");
		list.stream()
				.forEach(this::stun);
	}
}