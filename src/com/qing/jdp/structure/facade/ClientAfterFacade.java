package com.qing.jdp.structure.facade;

public class ClientAfterFacade {
    public static void main(String[] args) {
        VideoConversionFacade facade = new VideoConversionFacade("video.mp4");
        facade.convert();
    }
}
