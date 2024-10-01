package org.example.behavioral.chainOfResponsibility.notifier;

public class HighPriority implements Priority{
    @Override
    public MessagePriority getPriority() {
        return MessagePriority.HIGH;
    }
}
