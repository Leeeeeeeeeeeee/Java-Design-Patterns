package com.qing.jdp.structure.bridge;

//具体形状类
public class Circle implements Shape {
    private Color color;

    public Circle(Color color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.print("Draw a circle ");
        color.fill();
    }
}
