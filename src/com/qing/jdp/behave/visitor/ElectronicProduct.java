package com.qing.jdp.behave.visitor;

class ElectronicProduct implements Element {
    private double price;

    public ElectronicProduct(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
