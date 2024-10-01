package org.example.behavioral.command.brokerCommand;

public class SellStock implements Order{

    private final Stock stock;

    public SellStock(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.sell();
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
