package com.qing.jdp.create.abstractfactory;

public class Client {
    public static void main(String[] args) {
        // 使用具体工厂1创建产品A和产品B
        AbstractFactory factory1 = new ConcreteFactory1();
        ProductA productA1 = factory1.createProductA();
        ProductB productB1 = factory1.createProductB();
        productA1.operationA();
        productB1.operationB();

        // 使用具体工厂2创建产品A和产品B
        AbstractFactory factory2 = new ConcreteFactory2();
        ProductA productA2 = factory2.createProductA();
        ProductB productB2 = factory2.createProductB();
        productA2.operationA();
        productB2.operationB();
    }
}
