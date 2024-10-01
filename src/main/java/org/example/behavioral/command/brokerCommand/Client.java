package org.example.behavioral.command.brokerCommand;

public class Client {

    public static void main(String[] args) {
        Broker broker = new Broker.Builder().totalAmount(500000).build();
        Stock googleStock = new GoogleStock();
        Stock microsoftStock = new MicrosoftStock();
        Order buyGoogle = new BuyStock(googleStock);
        Order sellGoogle = new SellStock(googleStock);
        Order buyMicrosoft = new BuyStock(microsoftStock);
        Order sellMicrosoft = new SellStock(microsoftStock);
        broker.takeOrder(buyGoogle);
        broker.takeOrder(sellGoogle);
        broker.takeOrder(buyMicrosoft);
        broker.takeOrder(sellMicrosoft);
        broker.execute();
    }
}
