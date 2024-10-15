package org.example.behavioral.state.cartable;

import java.util.List;

public class Cartable {

    private CartableState cartableState;
    private List<Long> userIds;
    private CartableStates state;

    public Cartable() {
    }

    public void setCartableState(CartableState cartableState) {
        this.cartableState = cartableState;
    }

    public void setUserIds(List<Long> userIds) {
        this.userIds = userIds;
    }

    public void setState(CartableStates state) {
        this.state = state;
    }
}
