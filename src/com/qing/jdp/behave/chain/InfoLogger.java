package com.qing.jdp.behave.chain;

//具体处理者类 - INFO 日志处理者
class InfoLogger implements Logger {
 private Logger nextLogger;

 @Override
 public void setNext(Logger nextLogger) {
     this.nextLogger = nextLogger;
 }

 @Override
 public void logMessage(String message, int level) {
     if (level == 1) {
         System.out.println("INFO: " + message);
     } else if (nextLogger != null) {
         nextLogger.logMessage(message, level);
     }
 }
}