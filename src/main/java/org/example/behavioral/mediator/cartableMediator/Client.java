package org.example.behavioral.mediator.cartableMediator;

public class Client {

    public static void main(String[] args) {
        MediatorInterface cartableMediator = new CartableMediator();
        CartableLog cartableLog = new Cartable("1" , "emza" ,cartableMediator);
        cartableMediator.addUser("1");
        cartableMediator.addUser("2");
        cartableMediator.addUser("3");
        cartableMediator.addUser("4");
        cartableLog.sendToCartable();
    }
}
