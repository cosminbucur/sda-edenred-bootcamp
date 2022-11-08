package com.sda.patterns.structural.adapter.challenge.advanced;

public class VlcPlayer implements AdvancedMediaPlayer {

	private String filename;

	@Override
	public void loadFilename(String filename) {
		this.filename = filename;
	}

	@Override
	public void listen() {
		System.out.println("playing vlc: " + this.filename);
	}
}
