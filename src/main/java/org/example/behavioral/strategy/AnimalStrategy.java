package org.example.behavioral.strategy;

public class AnimalStrategy implements Animal{

    private final Animal animal;

    public AnimalStrategy(Animal animal) {
        this.animal = animal;
    }

    @Override
    public void eat() {
        this.animal.eat();
    }

    @Override
    public void sleep() {
        this.animal.sleep();
    }

    @Override
    public void voice() {
        this.animal.voice();
    }
}
