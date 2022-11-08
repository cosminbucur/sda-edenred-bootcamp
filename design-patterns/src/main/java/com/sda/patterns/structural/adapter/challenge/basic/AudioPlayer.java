package com.sda.patterns.structural.adapter.challenge.basic;

public class AudioPlayer implements MediaPlayer {

	@Override
	public void play(String audioType, String filename) {
		if (audioType.equalsIgnoreCase("mp3")) {
			System.out.println("playing " + audioType + ": " + filename);
		} else {
			System.out.println("invalid media, format not supported");
		}
	}
}
