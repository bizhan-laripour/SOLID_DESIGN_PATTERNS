package org.example.behavioral.mediator.simple;

public class Client {

    public static void main(String[] args) {
        ChatMediator chatMediator = new ChatMediatorImpl();
        UserModel userModel1 = new UserImpl(chatMediator , "Bizhan");
        UserModel userModel2 = new UserImpl(chatMediator , "Akbar");
        UserModel userModel3 = new UserImpl(chatMediator , "Mohsen");
        UserModel userModel4 = new UserImpl(chatMediator , "Enayat");
        chatMediator.addUser(userModel1);
        chatMediator.addUser(userModel2);
        chatMediator.addUser(userModel3);
        chatMediator.addUser(userModel4);
        userModel1.sendMessage("hi all");
    }
}
