package org.example.behavioral.chainOfResponsibility.withProxy;

/**
 * in this package i used below design patterns
 * 1.proxy
 * 2.bridge
 * 3.chain of responsibility
 * 4.builder
 */
public class Client {

    public static void main(String[] args) throws Exception {
        CheckUrlChain chain = new CheckPreDomain(new CheckPostDomain(new EndOfChain()));
        ServiceInterface proxy = new ServiceProxy.Builder().setCheckUrlChain(chain).build();
        proxy.service("http://www.amazon.ir");
    }
}
