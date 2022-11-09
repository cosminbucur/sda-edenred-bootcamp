package com.sda.patterns.structural.proxy.ex1;

public class Client {

	public static void main(String[] args) {
		Library library = new LibraryProxy();

		try {
			library.connect("http://google.com");
			library.connect("http://youtube.com");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
