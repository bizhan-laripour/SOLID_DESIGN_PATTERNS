package org.example.behavioral.command.brokerCommand;

import java.util.ArrayList;
import java.util.List;

public class Broker {

    private int totalAmount;

    private Broker(int totalAmount) {
        this.totalAmount = totalAmount;
    }

    private List<Order> orderList = new ArrayList<>();


    public void takeOrder(Order order) {
        orderList.add(order);
    }

    public void execute(){
        for (Order order : orderList) {
            if (order.getQuantity() < totalAmount) {
                if(order instanceof BuyStock) {
                    order.execute();
                    totalAmount -= order.getQuantity();
                }else if (order instanceof SellStock) {
                    order.execute();
                    totalAmount += order.getQuantity();
                }
            }else {
                System.out.println("total amount is less than your amount order for stock :"+order.getOrderName() +" with quantity:"+order.getQuantity());
            }

        }
    }

    public static class Builder {
        private int totalAmount;

        public Builder totalAmount(int totalAmount) {
            this.totalAmount = totalAmount;
            return this;
        }
        public Broker build() {
            return new Broker(totalAmount);
        }
    }
}
