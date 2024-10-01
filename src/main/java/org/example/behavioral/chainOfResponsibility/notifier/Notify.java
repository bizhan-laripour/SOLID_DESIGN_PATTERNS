package org.example.behavioral.chainOfResponsibility.notifier;

public abstract class Notify {

    private Priority priority;

    public Notify(Priority priority) {
        this.priority = priority;
    }

    public abstract void notify(Message message);

    public Priority getPriority() {
        return priority;
    }
}
