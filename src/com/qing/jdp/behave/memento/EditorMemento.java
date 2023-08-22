package com.qing.jdp.behave.memento;

//备忘录类
class EditorMemento {
 private String text;

 public EditorMemento(String text) {
     this.text = text;
 }

 public String getText() {
     return text;
 }
}
