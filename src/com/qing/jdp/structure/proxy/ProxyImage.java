package com.qing.jdp.structure.proxy;

public class ProxyImage implements Image {
    private RealImage realImage;
    private String filename;

    public ProxyImage(String filename) {
        this.filename = filename;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(filename);
        }
        beforeDisplay();
        realImage.display();
        afterDisplay();
    }

    private void beforeDisplay() {
        System.out.println("Performing pre-display operations");
    }

    private void afterDisplay() {
        System.out.println("Performing post-display operations");
    }
}