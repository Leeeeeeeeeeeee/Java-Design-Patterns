package com.qing.jdp.behave.command;

//具体命令类 - 关闭电视
class TVOffCommand implements Command {
 private TV tv;

 public TVOffCommand(TV tv) {
     this.tv = tv;
 }

 @Override
 public void execute() {
     tv.turnOff();
 }
}