package com.sda.patterns.structural.adapter.ex1;

public class JsonToXmlAdapter implements DataAdapter {

	private Json json;

	public JsonToXmlAdapter(Json json) {
		this.json = json;
	}

	public Xml convert(Json json) {
		// Logic to convert Json to Xml
		this.json.convertToXML();
		return new Xml();
	}
}
