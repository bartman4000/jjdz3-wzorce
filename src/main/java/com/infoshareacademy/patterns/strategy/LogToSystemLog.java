package com.infoshareacademy.patterns.strategy;

/**
 * Created by bartman3000 on 02.07.17.
 */
public class LogToSystemLog implements LoggingStrategy {

    @Override
    public void log(String message) {
        System.out.println("Logging to system log: " + message);
    }
}
