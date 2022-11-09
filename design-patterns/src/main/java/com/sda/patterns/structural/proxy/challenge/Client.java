package com.sda.patterns.structural.proxy.challenge;

public class Client {

	public static void main(String[] args) {
		Video video = new ProxyVideo("movie.mp4");

		// load from disk
		video.display();
		System.out.println("---");

		// load from cache
		video.display();
	}
}
