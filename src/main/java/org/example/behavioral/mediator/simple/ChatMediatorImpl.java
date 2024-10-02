package org.example.behavioral.mediator.simple;

import java.util.ArrayList;
import java.util.List;

public class ChatMediatorImpl implements ChatMediator{

    private List<UserModel> list;


    public ChatMediatorImpl() {
        this.list = new ArrayList<>();
    }

    @Override
    public void sendMessage(UserModel userModel , String message) {
        list.stream().filter(obj -> !obj.getName().equals(userModel.getName())).forEach(obj -> obj.receiveMessage(message));
    }

    @Override
    public void addUser(UserModel userModel) {
        list.add(userModel);
    }
}
