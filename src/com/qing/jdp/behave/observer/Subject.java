package com.qing.jdp.behave.observer;

//主题接口
interface Subject {
void registerObserver(Observer observer);
void removeObserver(Observer observer);
void notifyObservers(String news);
}
