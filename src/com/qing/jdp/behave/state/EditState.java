package com.qing.jdp.behave.state;

//编辑状态
class EditState implements EditorState {
 @Override
 public void type(String content) {
     System.out.println("Typing: " + content);
 }
}
