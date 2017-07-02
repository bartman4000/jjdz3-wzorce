package com.infoshareacademy.patterns.command;

/**
 * Created by bartman3000 on 02.07.17.
 */
public class ShowHostIPCommand implements Command {

    public void execute() {

        System.out.println("127.0.0.1");

    }
}

