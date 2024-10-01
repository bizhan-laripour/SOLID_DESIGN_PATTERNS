package org.example.behavioral.command.brokerCommand;

public class Stock {

    private String name = "Google";
    private int quantity = 1000;

    public void buy(){
        System.out.println("Buying " + name + " " + quantity);
    }

    public void sell(){
        System.out.println("Selling " + name + " " + quantity);
    }
}
