package com.qing.jdp.behave.visitor;

class VIPVisitor implements Visitor {
    @Override
    public double visit(Book book) {
        return book.getPrice() * 0.9; // 10% discount for VIP
    }

    @Override
    public double visit(ElectronicProduct electronicProduct) {
        return electronicProduct.getPrice() * 0.8; // 20% discount for VIP
    }
}
