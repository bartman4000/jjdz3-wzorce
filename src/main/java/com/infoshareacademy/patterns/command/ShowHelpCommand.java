package com.infoshareacademy.patterns.command;

/**
 * Created by bartman3000 on 02.07.17.
 */
public class ShowHelpCommand implements Command {

    static void execute() {
        System.out.println("ShowHostIP - display computer ip");
        System.out.println("ShowHostName - display name of the computer");
        System.out.println("ListDirectory - lists files in the current directory");
    }

}
