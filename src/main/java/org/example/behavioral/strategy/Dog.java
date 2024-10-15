package org.example.behavioral.strategy;

public class Dog implements Animal {

    private String name;

    public Dog() {
        this.name = "Dog";
    }

    @Override
    public void eat() {
        System.out.println("animal :"+name +" eats meat");
    }

    @Override
    public void sleep() {
        System.out.println("animal :"+name +" sleeps 6 hours a day");
    }

    @Override
    public void voice() {
        System.out.println("animal :"+name +" barks");
    }
}
