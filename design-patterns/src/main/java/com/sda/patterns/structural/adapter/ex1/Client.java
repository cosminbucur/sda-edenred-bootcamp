package com.sda.patterns.structural.adapter.ex1;

public class Client {

	public static void main(String[] args) {

		Json json = new Json("some json data");
		DataAdapter adapter = new JsonToXmlAdapter(json);
		Xml xml = adapter.convert(json);
		System.out.println(xml);
	}

}
