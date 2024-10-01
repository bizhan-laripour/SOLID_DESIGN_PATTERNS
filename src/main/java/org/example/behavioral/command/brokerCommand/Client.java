package org.example.behavioral.command.brokerCommand;

public class Client {

    public static void main(String[] args) {
        Broker broker = new Broker();
        Stock stock = new Stock();
        Order buy = new BuyStock(stock);
        Order sell = new SellStock(stock);
        broker.takeOrder(buy);
        broker.takeOrder(buy);
        broker.takeOrder(sell);
        broker.execute();
    }
}
