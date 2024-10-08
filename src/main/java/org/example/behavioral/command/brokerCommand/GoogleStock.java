package org.example.behavioral.command.brokerCommand;

public class GoogleStock implements Stock{

    private String name = "Google";
    private int quantity = 1000;

    @Override
    public void buy(){
        System.out.println("Buying " + name + " " + quantity);
    }

    @Override
    public void sell(){
        System.out.println("Selling " + name + " " + quantity);
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }
}
