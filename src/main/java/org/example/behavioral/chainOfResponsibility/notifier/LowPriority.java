package org.example.behavioral.chainOfResponsibility.notifier;

public class LowPriority implements Priority{
    @Override
    public MessagePriority getPriority() {
        return MessagePriority.LOW;
    }
}
