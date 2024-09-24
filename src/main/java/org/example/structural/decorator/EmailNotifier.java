package org.example.structural.decorator;

public class EmailNotifier extends NotificationDecorator{

    private String name = "Email Notifier";


    public EmailNotifier(Notifier notifier) {
        super(notifier);
    }

    @Override
    public String send(String message) {
       return super.send(message) + " and "+ name;
    }

}
