package com.qing.jdp.behave.observer;

public class ObserverPatternExample {
    public static void main(String[] args) {
        NewsAgency newsAgency = new NewsAgency();
        
        Observer subscriber1 = new Subscriber("Subscriber 1");
        Observer subscriber2 = new Subscriber("Subscriber 2");
        
        newsAgency.registerObserver(subscriber1);
        newsAgency.registerObserver(subscriber2);
        
        newsAgency.publishNews("New technology breakthrough!");
        
        newsAgency.removeObserver(subscriber1);
        
        newsAgency.publishNews("Important announcement!");
    }
}
