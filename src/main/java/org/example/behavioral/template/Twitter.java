package org.example.behavioral.template;

public class Twitter extends Network{

    public Twitter(String username , String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public boolean login() throws InterruptedException {
        System.out.println("\n Checking users parameters to twitter");
        System.out.println("username: " + this.username);
        System.out.print("password: ");
        for (int i = 0; i < this.password.length(); i++) {
            System.out.print("*");
        }
        super.simulateNetworkLatency();
        System.out.println("login successful to Twitter");
        return true;
    }

    @Override
    public boolean sendDate(byte[] data) {
        System.out.println("Message :" + new String(data)+" posted on twitter");
        return true;

    }

    @Override
    public void logout() {
        System.out.println("user "+username+" logged out from twitter");
    }
}
