package com.infoshareacademy.patterns.strategy;

public class Main {

    public static void main(String[] args) {

        SimpleLogger logger = new SimpleLogger(new LogToFile("file.txt"));
        logger.log("my log msg");
    }
}
