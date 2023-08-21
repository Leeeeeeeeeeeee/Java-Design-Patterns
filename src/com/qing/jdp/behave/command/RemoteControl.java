package com.qing.jdp.behave.command;

//调用者类 - 遥控器
class RemoteControl {
 private Command command;

 public void setCommand(Command command) {
     this.command = command;
 }

 public void pressButton() {
     command.execute();
 }
}