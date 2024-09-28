package org.example.structural.proxy.executer;

public class Client {
    public static void main(String[] args) {
        ServiceInterface proxy = new ServiceProxy();
        proxy.execute();
    }
}
