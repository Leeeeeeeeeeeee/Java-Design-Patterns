package com.qing.jdp.behave.state;

public class StatePatternExample {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();

        editor.type("Hello, ");
        editor.setState(new SelectState());
        editor.type("world!");
        editor.setState(new ReadOnlyState());
        editor.type("Oops!");

        editor.setState(new EditState());
        editor.type("Back to editing!");
    }
}