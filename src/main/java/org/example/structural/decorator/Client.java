package org.example.structural.decorator;

public class Client {

    public static void main(String[] args) {
        Notifier notifier = new NotificationDecorator(new InternalNotifier(new EmailNotifier(new SmsNotifier())));
        notifier.notify();
    }
}
