package com.infoshareacademy.patterns.chainofresponsibility;

public class SpamFilter extends MailFilter {

    @Override
    public void handle(Mail mail) {
        System.out.println("Filtering spam");
    }
}
