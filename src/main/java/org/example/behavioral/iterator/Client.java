package org.example.behavioral.iterator;

public class Client {

    public static void main(String[] args) {
        NotificationCollection notificationCollection = new NotificationCollection();
        notificationCollection.addItem("hello");
        notificationCollection.addItem("world");
        NotificationBar notificationBar = new NotificationBar(notificationCollection);
        notificationBar.printNotifications();

    }
}
