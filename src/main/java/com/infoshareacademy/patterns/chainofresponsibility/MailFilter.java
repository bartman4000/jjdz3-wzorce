package com.infoshareacademy.patterns.chainofresponsibility;

public abstract class MailFilter {

    private MailFilter nextMailFilter;

    public void setNextMailFilter(MailFilter nextMailFilter) {
        this.nextMailFilter = nextMailFilter;
    }

    public void handleMail(Mail mail) {
        handle(mail);
        if (nextMailFilter != null) {
            nextMailFilter.handleMail(mail);
        }
    }

    public abstract void handle(Mail mail);
}
