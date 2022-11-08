package com.sda.patterns.structural.adapter.challenge;


import com.sda.patterns.structural.adapter.challenge.advanced.AdvancedMediaPlayer;
import com.sda.patterns.structural.adapter.challenge.advanced.Mp4Player;
import com.sda.patterns.structural.adapter.challenge.advanced.VlcPlayer;
import com.sda.patterns.structural.adapter.challenge.basic.AudioPlayer;
import com.sda.patterns.structural.adapter.challenge.basic.MediaPlayer;

/**
 * playing mp3 file: file.mp3
 * playing mp4 file: file.mp4
 * playing vlc file: file.vlc
 * invalid media, format not supported
 */
public class Client {

	public static void main(String[] args) {
		MediaPlayer audioPlayer = new AudioPlayer();
		audioPlayer.play("mp3", "file.mp3");
		audioPlayer.play("avi", "file.avi");

		AdvancedMediaPlayer mp4Player = new Mp4Player();
		MediaPlayer advancedMp4Player = new AdvancedMediaPlayerAdapter(mp4Player);
		advancedMp4Player.play("mp4", "file.mp4");

		AdvancedMediaPlayer vlcPlayer = new VlcPlayer();
		MediaPlayer advancedVlcPlayer = new AdvancedMediaPlayerAdapter(vlcPlayer);
		advancedVlcPlayer.play("vlc", "file.vlc");
	}
}
