package com.qing.jdp.behave.strategy;

public class StrategyPatternExample {
    public static void main(String[] args) {
        ImageProcessor processor = new ImageProcessor();
        
        FilterStrategy blackAndWhiteFilter = new BlackAndWhiteFilter();
        FilterStrategy sepiaFilter = new SepiaFilter();
        
        processor.setFilterStrategy(blackAndWhiteFilter);
        processor.applyFilterToImage("image1.jpg");
        
        processor.setFilterStrategy(sepiaFilter);
        processor.applyFilterToImage("image2.jpg");
    }
}
