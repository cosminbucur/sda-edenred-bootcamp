package com.sda.patterns.structural.proxy.ex1;

import java.util.Set;

public class LibraryProxy implements Library {

	private final RealLibrary realLibrary = new RealLibrary();

	private final Set<String> restrictedSites =
			Set.of(
					"http://youtube.com",
					"http://netflix.com",
					"http://tiktok.com",
					"http://instagram.com",
					"http://facebook.com",
					"http://tweeter.com"
			);

	public void connect(String url) {
		if (restrictedSites.contains(url)) {
			throw new RuntimeException("restricted to " + url);
		} else {
			realLibrary.connect(url);
		}
	}
}
