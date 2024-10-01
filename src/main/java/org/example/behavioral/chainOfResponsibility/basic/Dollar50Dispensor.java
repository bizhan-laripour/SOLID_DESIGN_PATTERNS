package org.example.behavioral.chainOfResponsibility.basic;

public class Dollar50Dispensor implements DispenseChain{

    private final DispenseChain chain;

    public Dollar50Dispensor(DispenseChain chain) {
        this.chain = chain;
    }


    @Override
    public void dispense(Currency currency) {
        if(currency.getAmount() >= 50){
            int num = currency.getAmount() / 50;
            int remainder = currency.getAmount() % 50;
            System.out.println("Dispensing " + num + " of " + "50$");
            if(remainder != 0){
                this.chain.dispense(new Currency(remainder));
            }else {
                this.chain.dispense(currency);
            }
        }
    }
}
