package com.qing.jdp.structure.facade;

public class ClientBeforeFacade {
    public static void main(String[] args) {
        VideoFile videoFile = new VideoFile("video.mp4");
        videoFile.parse();

        VideoEncoder encoder = new VideoEncoder();
        encoder.encode(videoFile);

        VideoCompressor compressor = new VideoCompressor();
        compressor.compress(videoFile);
    }
}
