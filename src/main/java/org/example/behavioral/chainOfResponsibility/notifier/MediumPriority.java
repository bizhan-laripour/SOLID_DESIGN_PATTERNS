package org.example.behavioral.chainOfResponsibility.notifier;

public class MediumPriority implements Priority{
    @Override
    public MessagePriority getPriority() {
        return MessagePriority.MEDIUM;
    }
}
