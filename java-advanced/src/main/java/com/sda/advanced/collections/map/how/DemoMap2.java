package com.sda.advanced.collections.map.how;

import java.util.HashMap;
import java.util.Map;

public class DemoMap2 {

	public static void main(String[] args) {
		// create
		Map<String, String> countries = initMap();

		// read
		String country = countries.get("en");

		// update
		countries.put("fr", "russia");
		countries.put("usa", "states");

		// delete
		countries.remove("usa");

		for (String key : countries.keySet()) {
			System.out.println(countries.get(key));
		}
	}

	private static Map<String, String> initMap() {
		Map<String, String> countries = new HashMap<>();
		countries.put("ro", "romania");
		countries.put("en", "england");
		countries.put("fr", "france");
		return countries;
	}
}
