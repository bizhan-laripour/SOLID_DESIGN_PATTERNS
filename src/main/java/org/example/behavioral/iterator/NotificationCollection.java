package org.example.behavioral.iterator;

public class NotificationCollection implements Collection{

    private static final int MAX_ITEMS = 6;
    private int numberOfItems = 0;

    private Notification[] notifications ;


    public NotificationCollection() {
        notifications = new Notification[MAX_ITEMS];

    }

    @Override
    public Iterator createIterator() {
        return new NotificationIterator(notifications);
    }

    public void addItem(String item) {
        Notification notification = new Notification(item);
        if (numberOfItems >= MAX_ITEMS) {
            System.err.println("Maximum number of items reached");
        }else {
            notifications[numberOfItems] = notification;
            numberOfItems++;
        }
    }
}
