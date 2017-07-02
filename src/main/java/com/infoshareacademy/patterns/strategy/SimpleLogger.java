package com.infoshareacademy.patterns.strategy;

public class SimpleLogger {

    private LoggingStrategy logger;

    public SimpleLogger(LoggingStrategy logger)
    {
        this.logger = logger;
    }

    public void log(String message)
    {
        logger.log(message);
    }

}
