package com.qing.jdp.create.factory;

public class SimpleMain {
    public static void main(String[] args) {
        Product productA = SimpleFactory.createProduct("A");
        productA.doSomething();

        Product productB = SimpleFactory.createProduct("B");
        productB.doSomething();
    }
}
