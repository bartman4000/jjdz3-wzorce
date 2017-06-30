package com.infoshareacademy.patterns.chainofresponsibility;

public class GitHubFilter extends MailFilter {

    @Override
    public void handle(Mail mail) {
        System.out.println("Filtering github");
    }
}
