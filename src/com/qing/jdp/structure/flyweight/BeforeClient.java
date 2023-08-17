package com.qing.jdp.structure.flyweight;

//客户端代码
public class BeforeClient {
 public static void main(String[] args) {
	 Character char1 = new Character('A', "Arial", 12, "Black");
     Character char2 = new Character('B', "Times New Roman", 14, "Red");

     char1.draw();
     char2.draw();
 }
}
