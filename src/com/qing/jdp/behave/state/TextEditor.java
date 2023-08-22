package com.qing.jdp.behave.state;

//上下文类
class TextEditor {
 private EditorState currentState;

 public TextEditor() {
     currentState = new EditState(); // 默认初始状态为编辑状态
 }

 public void setState(EditorState state) {
     currentState = state;
 }

 public void type(String content) {
     currentState.type(content);
 }
}
