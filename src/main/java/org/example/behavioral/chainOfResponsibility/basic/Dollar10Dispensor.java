package org.example.behavioral.chainOfResponsibility.basic;

public class Dollar10Dispensor implements DispenseChain{

    private final DispenseChain chain;

    public Dollar10Dispensor(DispenseChain chain) {
        this.chain = chain;
    }

    @Override
    public void dispense(Currency currency) {
        if(currency.getAmount() >= 10){
            int num = currency.getAmount() / 10;
            int remainder = currency.getAmount() % 10;
            if(remainder != 0){
                this.chain.dispense(new Currency(remainder));
            }else {
                this.chain.dispense(currency);
            }
        }
    }
}
