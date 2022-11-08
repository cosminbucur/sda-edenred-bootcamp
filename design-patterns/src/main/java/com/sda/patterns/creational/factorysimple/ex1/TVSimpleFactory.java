package com.sda.patterns.creational.factorysimple.ex1;

public class TVSimpleFactory {

	public static TV getTV(TVMode tvMode) {
		switch (tvMode) {
			case COLOR:
//                return () -> System.out.println("COLOR TV");
				return new LedTV();
			case LCD:
				return () -> System.out.println("LCD TV");
			case LED:
				return () -> System.out.println("LED TV");
			default:
				throw new IllegalArgumentException("no such tv");
		}
	}
}
