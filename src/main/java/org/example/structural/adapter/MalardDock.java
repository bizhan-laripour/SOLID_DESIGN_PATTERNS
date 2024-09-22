package org.example.structural.adapter;

public class MalardDock implements Duck{
    @Override
    public void quack() {
        System.out.println("malard quack");
    }

    @Override
    public void fly() {

        System.out.println("malard fly");
    }
}
