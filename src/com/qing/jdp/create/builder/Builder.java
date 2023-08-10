package com.qing.jdp.create.builder;

public interface Builder {
    void buildProperty1(String property1);
    void buildProperty2(String property2);
    Product getResult();
}