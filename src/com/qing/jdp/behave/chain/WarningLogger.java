package com.qing.jdp.behave.chain;

//具体处理者类 - WARNING 日志处理者
class WarningLogger implements Logger {
 private Logger nextLogger;

 @Override
 public void setNext(Logger nextLogger) {
     this.nextLogger = nextLogger;
 }

 @Override
 public void logMessage(String message, int level) {
     if (level == 2) {
         System.out.println("WARNING: " + message);
     } else if (nextLogger != null) {
         nextLogger.logMessage(message, level);
     }
 }
}
