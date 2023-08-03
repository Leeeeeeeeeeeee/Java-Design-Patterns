package com.qing.jdp.create.factory;

public class ConcreteFactoryA implements Factory{

    @Override
    public Product createProduct() {
        return new ConcreteProductA();
    }
    
}
