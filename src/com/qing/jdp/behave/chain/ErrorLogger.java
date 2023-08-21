package com.qing.jdp.behave.chain;

//具体处理者类 - ERROR 日志处理者
class ErrorLogger implements Logger {
 @Override
 public void setNext(Logger nextLogger) {
     // ErrorLogger 是链的末尾，不需要设置下一个处理者
 }

 @Override
 public void logMessage(String message, int level) {
     if (level == 3) {
         System.out.println("ERROR: " + message);
     }
 }
}