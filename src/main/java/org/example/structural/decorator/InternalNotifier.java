package org.example.structural.decorator;

public class InternalNotifier extends NotificationDecorator{

    private String name ="Internal Notifier";

    public InternalNotifier(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void sendMessage() {
        super.sendMessage();
    }
}
