package org.example.behavioral.iterator.base;

public class NotificationIterator implements Iterator{

    private Notification[] notifications;
    int index = 0;

    public NotificationIterator(Notification[] notifications) {
        this.notifications = notifications;
    }

    @Override
    public boolean hasNext() {
        return index < notifications.length && notifications[index] != null;
    }

    @Override
    public Object next() {
        Notification notification = notifications[index];
        index += 1;
        return notification;
    }
}
