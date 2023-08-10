package com.qing.jdp.create.builder;

public class ConcreteBuilder implements Builder {
    private Product product = new Product();

    public void buildProperty1(String property1) {
        product.setProperty1(property1);
    }

    public void buildProperty2(String property2) {
        product.setProperty2(property2);
    }

    public Product getResult() {
        return product;
    }
}