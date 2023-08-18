package com.qing.jdp.behave.observer;

import java.util.ArrayList;
import java.util.List;

//具体主题类
class NewsAgency implements Subject {
 private List<Observer> observers = new ArrayList<>();
 
 @Override
 public void registerObserver(Observer observer) {
     observers.add(observer);
 }
 
 @Override
 public void removeObserver(Observer observer) {
     observers.remove(observer);
 }
 
 @Override
 public void notifyObservers(String news) {
     for (Observer observer : observers) {
         observer.update(news);
     }
 }
 
 public void publishNews(String news) {
     System.out.println("Publishing news: " + news);
     notifyObservers(news);
 }
}