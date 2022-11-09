package com.sda.patterns.structural.proxy.challenge;

public class ProxyVideo implements Video {

	private RealVideo realVideo;
	private String filename;

	public ProxyVideo(String filename) {
		this.filename = filename;
	}

	@Override
	public void display() {
		if (realVideo == null) {
			realVideo = new RealVideo(filename);
		}
		realVideo.display();
	}
}
