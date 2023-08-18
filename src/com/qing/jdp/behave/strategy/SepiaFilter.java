package com.qing.jdp.behave.strategy;

class SepiaFilter implements FilterStrategy {
    @Override
    public void applyFilter(String image) {
        System.out.println("Applying sepia filter to " + image);
    }
}
