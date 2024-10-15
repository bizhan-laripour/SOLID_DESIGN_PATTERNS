package org.example.behavioral.state.cartable;

public abstract class CartableState {

    protected Cartable cartable;

    protected CartableState(Cartable cartable) {
        this.cartable = cartable;
    }

    public abstract void confirm();
    public abstract void sign();
    public abstract void pay();
}
