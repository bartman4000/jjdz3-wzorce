package com.infoshareacademy.patterns.command;

/**
 * Created by bartman3000 on 02.07.17.
 */
public class ListDirectoryCommand implements Command {

    static void execute() {
        System.out.println("file1.txt");
        System.out.println("file2.txt");
    }
}
