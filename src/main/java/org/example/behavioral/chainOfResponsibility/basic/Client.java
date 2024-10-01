package org.example.behavioral.chainOfResponsibility.basic;

public class Client {

    public static void main(String[] args) {
        DispenseChain c1 = new Dollar50Dispensor(new Dollars20Dispensor(new Dollar10Dispensor(new LastDispensor())));
        c1.dispense(new Currency(100));
    }
}
