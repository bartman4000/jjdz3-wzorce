package com.infoshareacademy.patterns.strategy;

/**
 * Created by bartman3000 on 02.07.17.
 */
public class LogToFile implements LoggingStrategy {

    private String path;

    public LogToFile(String path) {
        this.path = path;
    }

    @Override
    public void log(String message) {
        System.out.println("Logging to file: " + message);
    }
}
