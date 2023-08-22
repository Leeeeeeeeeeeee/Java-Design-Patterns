package com.qing.jdp.behave.visitor;

//具体访问者类
class NormalVisitor implements Visitor {
 @Override
 public double visit(Book book) {
     return book.getPrice();
 }

 @Override
 public double visit(ElectronicProduct electronicProduct) {
     return electronicProduct.getPrice();
 }
}
