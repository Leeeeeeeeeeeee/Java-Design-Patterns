package com.qing.jdp.behave.mediator;

//用户类
class User {
 private String name;
 private ChatMediator chatMediator;

 public User(String name, ChatMediator chatMediator) {
     this.name = name;
     this.chatMediator = chatMediator;
 }

 public String getName() {
     return name;
 }

 public void sendMessage(String message) {
     chatMediator.sendMessage(this, message);
 }

 public void receiveMessage(String message) {
     System.out.println(name + " received: " + message);
 }
}
