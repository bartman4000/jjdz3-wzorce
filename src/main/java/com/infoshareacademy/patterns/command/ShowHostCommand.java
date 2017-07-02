package com.infoshareacademy.patterns.command;

/**
 * Created by bartman3000 on 02.07.17.
 */
public class ShowHostCommand implements Command {

    static void execute() {
        System.out.println("localhost");
    }

}
