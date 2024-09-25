package org.example.structural.decorator.notifierDecorator;

public class SmsNotifier implements Notifier{

    private String name = "SMS Notifier";

    @Override
    public String send(String message) {
       return message + " from "+name;
    }
}
