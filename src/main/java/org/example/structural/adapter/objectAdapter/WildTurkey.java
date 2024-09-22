package org.example.structural.adapter.objectAdapter;

public class WildTurkey implements Turkey{
    @Override
    public void gobble() {
        System.out.println("WildTurkey gobble");
    }

    @Override
    public void fly() {
        System.out.println("WildTurkey fly");
    }
}
