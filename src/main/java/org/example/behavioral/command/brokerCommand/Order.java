package org.example.behavioral.command.brokerCommand;

public interface Order {

    void execute();

    int getQuantity();

    String getOrderName();
}
