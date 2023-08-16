package com.qing.jdp.structure.decorator;

//装饰器抽象类
abstract class CoffeeDecorator implements Coffee {
 protected Coffee decoratedCoffee;

 public CoffeeDecorator(Coffee decoratedCoffee) {
     this.decoratedCoffee = decoratedCoffee;
 }

 @Override
 public String getDescription() {
     return decoratedCoffee.getDescription();
 }

 @Override
 public double cost() {
     return decoratedCoffee.cost();
 }
}
