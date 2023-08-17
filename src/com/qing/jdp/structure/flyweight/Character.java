package com.qing.jdp.structure.flyweight;

// 非享元模式的字符类
public class Character {
    private char symbol;
    private String font;
    private int size;
    private String color;

    public Character(char symbol, String font, int size, String color) {
        this.symbol = symbol;
        this.font = font;
        this.size = size;
        this.color = color;
    }

    public void draw() {
        System.out.println("Drawing character " + symbol + " with font " + font +
                           ", size " + size + ", and color " + color);
    }
}
