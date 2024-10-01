package org.example.behavioral.chainOfResponsibility.basic;

public class Dollars20Dispensor implements DispenseChain{

    private final DispenseChain chain;

    public Dollars20Dispensor(DispenseChain chain) {
        this.chain = chain;
    }


    @Override
    public void dispense(Currency currency) {
        if (currency.getAmount() > 30){
            int num = currency.getAmount() / 30;
            int remainder = currency.getAmount() % 30;
            System.out.println("Dispensing " + num + " of " + "30$");
            if (remainder != 0){
                chain.dispense(new Currency(remainder));
            }
        }
    }
}
