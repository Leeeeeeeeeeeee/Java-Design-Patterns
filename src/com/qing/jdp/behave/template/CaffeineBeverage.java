package com.qing.jdp.behave.template;

//抽象类，定义了制作咖啡因饮料的模板方法
abstract class CaffeineBeverage {
 final void prepareRecipe() {
     boilWater();
     brew();
     pourInCup();
     addCondiments();
 }
 
 abstract void brew();
 
 abstract void addCondiments();
 
 void boilWater() {
     System.out.println("Boiling water");
 }
 
 void pourInCup() {
     System.out.println("Pouring into cup");
 }
}