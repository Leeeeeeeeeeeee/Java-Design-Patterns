package com.qing.jdp.behave.state;

//选中状态
class SelectState implements EditorState {
 @Override
 public void type(String content) {
     System.out.println("Cannot type in select mode.");
 }
}