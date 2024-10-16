package org.example.behavioral.template;

public class FaceBook extends Network{

    public FaceBook(String username , String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public boolean login() throws InterruptedException {
        System.out.println("\n Checking users parameters to FaceBook");
        System.out.println("username: " + username);
        System.out.print("password: ");
        for (int i = 0; i < password.length(); i++) {
            System.out.print("*");
        }
        super.simulateNetworkLatency();
        System.out.println("login successful to FaceBook");
        return true;
    }

    @Override
    public boolean sendDate(byte[] data) {
            System.out.println("Message :" + new String(data)+" posted on faceBook");
            return true;

    }

    @Override
    public void logout() {
        System.out.println("user "+username+" logged out from twitter");
    }


}
