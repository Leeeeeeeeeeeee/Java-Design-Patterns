package com.qing.jdp.create.factory;

public class SimpleFactory {
    public static Product createProduct(String type) {
        if ("A".equalsIgnoreCase(type)) {
            return new ConcreteProductA();
        } else if ("B".equalsIgnoreCase(type)) {
            return new ConcreteProductB();
        }
        return null;
    }
}