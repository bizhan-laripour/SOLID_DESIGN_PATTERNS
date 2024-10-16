package org.example.behavioral.template;

public class Demo extends Network {


    private final Network network;

    public Demo(Network network) {
        this.network = network;
    }

    @Override
    public boolean login() throws InterruptedException {
        return network.login();
    }

    @Override
    public boolean sendDate(byte[] data) {
        return network.sendDate(data);
    }

    @Override
    public void logout() {
        network.logout();
    }
}
