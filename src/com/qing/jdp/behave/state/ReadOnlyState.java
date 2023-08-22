package com.qing.jdp.behave.state;

//只读状态
class ReadOnlyState implements EditorState {
 @Override
 public void type(String content) {
     System.out.println("Cannot type in read-only mode.");
 }
}
