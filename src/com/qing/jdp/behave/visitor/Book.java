package com.qing.jdp.behave.visitor;

//具体元素类
class Book implements Element {
 private double price;

 public Book(double price) {
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