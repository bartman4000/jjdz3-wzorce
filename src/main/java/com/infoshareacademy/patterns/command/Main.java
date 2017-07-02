package com.infoshareacademy.patterns.command;

public class Main {

    public static void main(String[] args) {

        ShowHelpCommand.execute();
        ShowHostCommand.execute();
        ShowIPCommand.execute();
        ListDirectoryCommand.execute();

    }
}
