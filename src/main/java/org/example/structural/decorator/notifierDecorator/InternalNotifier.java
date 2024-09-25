package org.example.structural.decorator.notifierDecorator;

public class InternalNotifier extends NotificationDecorator{

    private String name = "InternalNotifier";

    public InternalNotifier(Notifier notifier) {
        super(notifier);
    }

    @Override
    public String send(String message) {
        return super.send(message) + " and "+name;
    }
}
