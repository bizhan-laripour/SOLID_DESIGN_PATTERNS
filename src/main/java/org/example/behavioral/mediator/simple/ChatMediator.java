package org.example.behavioral.mediator.simple;

public interface ChatMediator {

    void sendMessage(UserModel userModel , String message);
    void addUser(UserModel userModel);
}
