package org.example.behavioral.strategy;

public class Cat implements Animal{

    private String name;

    public Cat() {
        this.name = "Cat";
    }

    @Override
    public void eat() {
        System.out.println("animal: "+this.name +" eats meat too");
    }

    @Override
    public void sleep() {
        System.out.println("animal: "+this.name +" sleeps 6 hours a day");
    }

    @Override
    public void voice() {
        System.out.println("animal: "+this.name +" meow");
    }
}
