package com.qing.jdp.behave.chain;

//处理者接口
interface Logger {
 void setNext(Logger nextLogger);
 void logMessage(String message, int level);
}