package com.sda.advanced.optional.nulls;

import java.util.ArrayList;
import java.util.List;

public class AvoidNull {

	private String badString = null;
	private String goodString = "";

	private List<String> badList = null;
	private List<String> goodList = new ArrayList<>();

	public static void main(String[] args) {
		AvoidNull avoidNull = new AvoidNull();
		avoidNull.dealWithEmptyString();
		avoidNull.dealWithEmptyList();
	}

	public void dealWithEmptyList() {
		for (String name : badList) {
			System.out.println(name);
		}
	}

	public String dealWithEmptyString() {
		return badString.toUpperCase();
	}

	public List<String> getBadList() {
		return badList;
	}

	public void setBadList(List<String> badList) {
		this.badList = badList;
	}
}
