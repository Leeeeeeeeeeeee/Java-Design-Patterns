package com.qing.jdp.structure.bridge;

public class BridgePatternExample {
    public static void main(String[] args) {
        Color redColor = new RedColor();
        Color greenColor = new GreenColor();

        Shape redCircle = new Circle(redColor);
        Shape greenCircle = new Circle(greenColor);

        redCircle.draw();    // Output: Draw a circle with red color.
        greenCircle.draw();  // Output: Draw a circle with green color.
    }
}
