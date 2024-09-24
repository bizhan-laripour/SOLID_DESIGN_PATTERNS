package org.example.structural.decorator;

public class NotificationDecorator implements Notifier {

    private final Notifier notifier;

    public NotificationDecorator(Notifier notifier) {
        this.notifier = notifier;
    }

    @Override
    public void sendMessage() {
        notifier.sendMessage();
    }
}
