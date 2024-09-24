package org.example.structural.decorator;

public class Client {

    public static void main(String[] args) {
        NotificationDecorator notificationDecorator = new NotificationDecorator(new EmailNotifier(new InternalNotifier(new SmsNotifier())));
        notificationDecorator.showMessage("hello world");
    }
}
