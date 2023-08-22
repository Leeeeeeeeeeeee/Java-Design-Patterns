package com.qing.jdp.behave.mediator;
import java.util.ArrayList;
import java.util.List;

//具体中介者类
class ChatRoom implements ChatMediator {
 private List<User> users = new ArrayList<>();

 @Override
 public void sendMessage(User user, String message) {
     for (User u : users) {
         if (u != user) {
             u.receiveMessage(user.getName() + ": " + message);
         }
     }
 }

 public void addUser(User user) {
     users.add(user);
 }
}
