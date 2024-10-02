package org.example.behavioral.mediator.cartableMediator;

public abstract class CartableLog {

    protected MediatorInterface mediatorInterface;

    protected String cartableId;

    protected String name;

    protected String userId;

    public CartableLog(String cartableId, String name, MediatorInterface mediatorInterface) {
        this.cartableId = cartableId;
        this.name = name;
        this.mediatorInterface = mediatorInterface;
    }


    public abstract void sendToCartable();

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
