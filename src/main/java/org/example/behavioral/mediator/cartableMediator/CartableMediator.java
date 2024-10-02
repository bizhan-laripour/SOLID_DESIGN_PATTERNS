package org.example.behavioral.mediator.cartableMediator;

import java.util.ArrayList;
import java.util.List;

public class CartableMediator implements MediatorInterface{

    private List<String> users;
    private List<CartableLog> cartableLogs;

    public CartableMediator() {
        this.users = new ArrayList<>();
        this.cartableLogs = new ArrayList<>();
    }


    @Override
    public void sendToCartable(CartableLog cartableLog) {
        for (String id : users){
            cartableLog.setUserId(id);
            cartableLogs.add(cartableLog);
            System.out.println("cartable log added to user cartable with id: "+ id);

        }
    }

    @Override
    public void addUser(String userId) {
        users.add(userId);
    }
}
