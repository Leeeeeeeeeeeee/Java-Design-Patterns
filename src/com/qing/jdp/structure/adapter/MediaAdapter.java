package com.qing.jdp.structure.adapter;

public class MediaAdapter implements MediaPlayer {
    private MP3Player mp3Player;

    public MediaAdapter() {
        mp3Player = new MP3Player();
    }

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("MP3")) {
            mp3Player.playMP3(fileName);
        } else {
            System.out.println("Unsupported audio format: " + audioType);
        }
    }
}