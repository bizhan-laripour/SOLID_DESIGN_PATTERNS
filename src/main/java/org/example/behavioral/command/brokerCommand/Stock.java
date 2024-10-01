package org.example.behavioral.command.brokerCommand;

public interface Stock {

    void buy();

    void sell();

    int getQuantity();

    String getName();
}
