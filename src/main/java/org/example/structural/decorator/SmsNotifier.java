package org.example.structural.decorator;

public class SmsNotifier implements Notifier{

    private String name = "SMS Notifier";

    @Override
    public void sendMessage() {
        System.out.println("message send via "+name + " and content is : hello from SMS Notifier");
    }
}
