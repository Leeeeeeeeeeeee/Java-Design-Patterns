package com.qing.jdp.behave.observer;

//具体观察者类
class Subscriber implements Observer {
 private String name;
 
 public Subscriber(String name) {
     this.name = name;
 }
 
 @Override
 public void update(String news) {
     System.out.println(name + " received news: " + news);
 }
}
