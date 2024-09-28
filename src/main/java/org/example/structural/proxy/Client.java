package org.example.structural.proxy;

public class Client {
    public static void main(String[] args) {
        ProxyImage proxyImage = new ProxyImage("file");
        proxyImage.display();
    }
}
