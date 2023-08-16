package com.qing.jdp.structure.facade;

public class VideoConversionFacade {
    private VideoFile videoFile;

    public VideoConversionFacade(String filename) {
        this.videoFile = new VideoFile(filename);
    }

    public void convert() {
        videoFile.parse();

        VideoEncoder encoder = new VideoEncoder();
        encoder.encode(videoFile);

        VideoCompressor compressor = new VideoCompressor();
        compressor.compress(videoFile);
    }
}
