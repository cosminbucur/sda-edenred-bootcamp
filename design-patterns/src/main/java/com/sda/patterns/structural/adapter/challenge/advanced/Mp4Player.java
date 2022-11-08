package com.sda.patterns.structural.adapter.challenge.advanced;

public class Mp4Player implements AdvancedMediaPlayer {

	private String filename;

	@Override
	public void loadFilename(String filename) {
		this.filename = filename;
	}

	@Override
	public void listen() {
		System.out.println("playing mp4: " + this.filename);
	}
}
