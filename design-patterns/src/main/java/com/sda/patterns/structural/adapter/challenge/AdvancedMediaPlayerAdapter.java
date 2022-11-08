package com.sda.patterns.structural.adapter.challenge;

import com.sda.patterns.structural.adapter.challenge.advanced.AdvancedMediaPlayer;
import com.sda.patterns.structural.adapter.challenge.basic.MediaPlayer;

public class AdvancedMediaPlayerAdapter implements MediaPlayer {

	private final AdvancedMediaPlayer advancedMediaPlayer;

	public AdvancedMediaPlayerAdapter(AdvancedMediaPlayer advancedMediaPlayer) {
		this.advancedMediaPlayer = advancedMediaPlayer;
	}

	@Override
	public void play(String audioType, String filename) {
		advancedMediaPlayer.loadFilename(filename);
		advancedMediaPlayer.listen();
	}
}
