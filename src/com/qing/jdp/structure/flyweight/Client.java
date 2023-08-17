package com.qing.jdp.structure.flyweight;

//客户端代码
public class Client {
 public static void main(String[] args) {
     CharacterFactory characterFactory = new CharacterFactory();

     Character char1 = characterFactory.getCharacter('A', "Arial", 12, "Black");
     Character char2 = characterFactory.getCharacter('B', "Times New Roman", 14, "Red");

     char1.draw();
     char2.draw();
 }
}