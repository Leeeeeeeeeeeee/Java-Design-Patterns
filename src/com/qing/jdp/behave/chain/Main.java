package com.qing.jdp.behave.chain;

public class Main {
    public static void main(String[] args) {
        Logger infoLogger = new InfoLogger();
        Logger warningLogger = new WarningLogger();
        Logger errorLogger = new ErrorLogger();

        infoLogger.setNext(warningLogger);
        warningLogger.setNext(errorLogger);

        infoLogger.logMessage("This is an info message.", 1);
        infoLogger.logMessage("This is a warning message.", 2);
        infoLogger.logMessage("This is an error message.", 3);
    }
}