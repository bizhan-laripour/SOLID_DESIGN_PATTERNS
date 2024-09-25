package org.example.structural.decorator.notifierDecorator;

public class NotificationDecorator implements Notifier{

    private final Notifier notifier;

    public NotificationDecorator(Notifier notifier) {
        this.notifier = notifier;
    }

    @Override
    public String send(String message) {
        return notifier.send(message);
    }

    public void showMessage(String message) {
        System.out.println(send(message));
    }

}
