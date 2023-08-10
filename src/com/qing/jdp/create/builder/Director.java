package com.qing.jdp.create.builder;

public class Director {
    public Product construct(Builder builder) {
        builder.buildProperty1("Value 1");
        builder.buildProperty2("Value 2");
        return builder.getResult();
    }
}