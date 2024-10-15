package org.example.behavioral.state.cartable;

public class ConfirmState extends CartableState{


    protected ConfirmState(Cartable cartable) {
        super(cartable);
        cartable.setState(CartableStates.CONFIRM);
    }

    @Override
    public void confirm() {

    }

    @Override
    public void sign() {

    }

    @Override
    public void pay() {

    }
}
