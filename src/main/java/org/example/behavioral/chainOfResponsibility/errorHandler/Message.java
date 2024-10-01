package org.example.behavioral.chainOfResponsibility.errorHandler;

public class Message {
    private final String message;

    private final MessagePriority messagePriority;

    public Message(String message, MessagePriority messagePriority) {
        this.message = message;
        this.messagePriority = messagePriority;
    }

    public String getMessage() {
        return message;
    }

    public MessagePriority getMessagePriority() {
        return messagePriority;
    }
}
