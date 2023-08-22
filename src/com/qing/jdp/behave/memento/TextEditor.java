package com.qing.jdp.behave.memento;
import java.util.Stack;

//发起人类
class TextEditor {
 private String text;
 private Stack<EditorMemento> history = new Stack<>();

 public void setText(String text) {
     this.text = text;
 }

 public String getText() {
     return text;
 }

 public void save() {
     history.push(new EditorMemento(text));
 }

 public void undo() {
     if (!history.isEmpty()) {
         EditorMemento memento = history.pop();
         text = memento.getText();
     }
 }
}