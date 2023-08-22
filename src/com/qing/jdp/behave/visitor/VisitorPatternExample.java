package com.qing.jdp.behave.visitor;

public class VisitorPatternExample {
    public static void main(String[] args) {
        Element[] elements = {
            new Book(20),
            new ElectronicProduct(100)
        };

        Visitor normalVisitor = new NormalVisitor();
        Visitor vipVisitor = new VIPVisitor();

        for (Element element : elements) {
            System.out.println("Normal visitor price: " + element.accept(normalVisitor));
            System.out.println("VIP visitor price: " + element.accept(vipVisitor));
        }
    }
}