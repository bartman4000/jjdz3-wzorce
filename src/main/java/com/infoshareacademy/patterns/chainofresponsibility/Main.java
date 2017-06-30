package com.infoshareacademy.patterns.chainofresponsibility;

public class Main {

    public static void main(String[] args) {
        SpamFilter spamFilter = new SpamFilter();
        NewsFilter newsFilter = new NewsFilter();
        WorkFilter workFilter = new WorkFilter();
        GitHubFilter gitHubFilter = new GitHubFilter();

        spamFilter.setNextMailFilter(newsFilter);
        newsFilter.setNextMailFilter(workFilter);
        workFilter.setNextMailFilter(gitHubFilter);

        Mail mail = new Mail("from@mail.com", "to@mail.com", "content");

        MailBox mailBox = new MailBox(spamFilter);

        mailBox.receiveMail(mail);
    }
}
