package org.example.behavioral.command.brokerCommand;

public class BuyStock implements Order {

    private final Stock stock;

    public BuyStock(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.buy();
    }

    @Override
    public int getQuantity() {
        return stock.getQuantity();
    }

    @Override
    public String getOrderName() {
        return stock.getName();
    }
}
