package org.example.behavioral.chainOfResponsibility.basic;

public class LastDispensor implements DispenseChain{

    @Override
    public void dispense(Currency currency) {
        System.out.println("End");
    }
}
