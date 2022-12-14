package com.sda.advanced.exceptions.error_vs_exception;

// demonstrate stack overflow error by doing infinite recursion
public class StackOverflow {

	public static void work(int i) {
		// not ok as base condition leads to non-stop recursion
		if (i == 0) {
			System.out.println("ok");
		} else {
			work(i++);
		}
	}
}
