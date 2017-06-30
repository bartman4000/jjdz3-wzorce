package com.infoshareacademy.patterns.chainofresponsibility;

public class MailBox {

    private MailFilter mailFilter;

    public MailBox(MailFilter mailFilter) {
        this.mailFilter = mailFilter;
    }

    public void receiveMail(Mail mail) {
        mailFilter.handleMail(mail);
    }
}
