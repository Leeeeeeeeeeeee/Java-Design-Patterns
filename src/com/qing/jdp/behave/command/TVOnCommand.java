package com.qing.jdp.behave.command;

//具体命令类 - 打开电视
class TVOnCommand implements Command {
 private TV tv;

 public TVOnCommand(TV tv) {
     this.tv = tv;
 }

 @Override
 public void execute() {
     tv.turnOn();
 }
}