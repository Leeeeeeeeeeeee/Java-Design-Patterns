package com.qing.jdp.behave.strategy;

//上下文
class ImageProcessor {
 private FilterStrategy filterStrategy;
 
 public void setFilterStrategy(FilterStrategy filterStrategy) {
     this.filterStrategy = filterStrategy;
 }
 
 public void applyFilterToImage(String image) {
     filterStrategy.applyFilter(image);
 }
}