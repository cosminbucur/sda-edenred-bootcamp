package com.sda.patterns.structural.proxy.challenge;

public class RealVideo implements Video {

	private String filename;

	public RealVideo(String filename) {
		this.filename = filename;
		loadFromDisk(filename);
	}

	@Override
	public void display() {
		System.out.println("playing " + this.filename);
	}

	private void loadFromDisk(String filename) {
		System.out.println("loading from disk: " + filename);
	}
}
