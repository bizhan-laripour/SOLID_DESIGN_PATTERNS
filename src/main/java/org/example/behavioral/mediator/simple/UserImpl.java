package org.example.behavioral.mediator.simple;

public class UserImpl extends UserModel{

    public UserImpl(ChatMediator chatMediator, String name) {
        super(chatMediator, name);
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("Sending message: " + message + " by "+this.getName());
        chatMediator.sendMessage(this, message);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println("Receiving message: " + message + " to "+this.getName());
    }
}
