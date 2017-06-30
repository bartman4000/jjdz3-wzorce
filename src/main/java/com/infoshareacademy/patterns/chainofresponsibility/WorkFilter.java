package com.infoshareacademy.patterns.chainofresponsibility;

public class WorkFilter extends MailFilter {

    @Override
    public void handle(Mail mail) {
        System.out.println("Filtering work");
    }
}
