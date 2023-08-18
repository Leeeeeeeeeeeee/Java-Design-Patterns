package com.qing.jdp.behave.template;

//具体子类，实现了具体的饮料制作步骤
class Coffee extends CaffeineBeverage {
 @Override
 void brew() {
     System.out.println("Dripping coffee through filter");
 }
 
 @Override
 void addCondiments() {
     System.out.println("Adding sugar and milk");
 }
}
