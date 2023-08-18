package com.qing.jdp.behave.strategy;

class BlackAndWhiteFilter implements FilterStrategy {
    @Override
    public void applyFilter(String image) {
        System.out.println("Applying black and white filter to " + image);
    }
}