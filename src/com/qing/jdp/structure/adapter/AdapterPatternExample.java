package com.qing.jdp.structure.adapter;

public class AdapterPatternExample {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("MP3", "song.mp3");
        audioPlayer.play("VLC", "song.vlc");
        audioPlayer.play("MP4", "song.mp4");
        audioPlayer.play("FLAC", "song.flac");
    }
}
