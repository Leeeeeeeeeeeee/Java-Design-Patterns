package com.qing.jdp.create.builder;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        Builder builder = new ConcreteBuilder();
        Product product = director.construct(builder);
    }
}
