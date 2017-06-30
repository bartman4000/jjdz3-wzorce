package com.infoshareacademy.patterns.chainofresponsibility;

public class NewsFilter extends MailFilter {

    @Override
    public void handle(Mail mail) {
        System.out.println("Filtering news");

    }
}
