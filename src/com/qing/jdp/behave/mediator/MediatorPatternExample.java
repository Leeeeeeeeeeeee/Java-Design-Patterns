package com.qing.jdp.behave.mediator;

public class MediatorPatternExample {
    public static void main(String[] args) {
        ChatRoom chatMediator = new ChatRoom();

        User user1 = new User("Alice", chatMediator);
        User user2 = new User("Bob", chatMediator);
        User user3 = new User("Charlie", chatMediator);

        chatMediator.addUser(user1);
        chatMediator.addUser(user2);
        chatMediator.addUser(user3);

        user1.sendMessage("Hello, everyone!");
        user2.sendMessage("Hey there!");
    }
}