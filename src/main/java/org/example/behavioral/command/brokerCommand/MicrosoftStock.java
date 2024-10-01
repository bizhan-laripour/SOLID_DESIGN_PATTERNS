package org.example.behavioral.command.brokerCommand;

public class MicrosoftStock implements Stock{

    private String name = "Microsoft";
    private int quantity = 5000;

    @Override
    public void buy() {
        System.out.println("Buying "+name+" "+quantity);
    }

    @Override
    public void sell() {
        System.out.println("Selling "+name+" "+quantity);
    }

    @Override
    public int getQuantity() {
        return quantity;
    }

    @Override
    public String getName() {
        return name;
    }


}
