package com.qing.jdp.behave.memento;

public class MementoPatternExample {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();

        editor.setText("Hello, world!");
        editor.save();

        editor.setText("Updated text.");
        System.out.println("Current text: " + editor.getText());

        editor.undo();
        System.out.println("After undo: " + editor.getText());
    }
}
