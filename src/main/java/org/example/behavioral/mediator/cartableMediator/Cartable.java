package org.example.behavioral.mediator.cartableMediator;

public class Cartable extends CartableLog{


    public Cartable(String cartableId, String name, MediatorInterface mediatorInterface) {
        super(cartableId, name, mediatorInterface);
    }

    @Override
    public void sendToCartable() {
        System.out.println("sendTo cartable");
        mediatorInterface.sendToCartable( this);
    }
}
