package com.sda.patterns.structural.adapter.ex1;

public class Json {

	private final String input;

	public Json(String input) {
		this.input = input;
	}

	Xml convertToXML() {
		// convert the data into xml
		return new Xml();
	}
}
