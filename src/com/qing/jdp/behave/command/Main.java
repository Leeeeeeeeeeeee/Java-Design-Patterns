package com.qing.jdp.behave.command;

public class Main {
    public static void main(String[] args) {
        TV tv = new TV();
        Command tvOnCommand = new TVOnCommand(tv);
        Command tvOffCommand = new TVOffCommand(tv);

        RemoteControl remote = new RemoteControl();
        remote.setCommand(tvOnCommand);
        remote.pressButton(); // 打开电视

        remote.setCommand(tvOffCommand);
        remote.pressButton(); // 关闭电视
    }
}