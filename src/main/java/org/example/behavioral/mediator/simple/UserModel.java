package org.example.behavioral.mediator.simple;

public abstract class UserModel {

    protected ChatMediator chatMediator;
    private String name;

    public UserModel(ChatMediator chatMediator, String name) {
        this.chatMediator = chatMediator;
        this.name = name;
    }

    public abstract void sendMessage(String message);

    public abstract void receiveMessage(String message);

    public String getName() {
        return name;
    }
}
