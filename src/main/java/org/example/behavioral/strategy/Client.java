package org.example.behavioral.strategy;

public class Client {


    public static void main(String[] args) {
        Animal strategyAnimal = new AnimalStrategy(new Dog());
        strategyAnimal.eat();
        strategyAnimal.sleep();
        strategyAnimal.voice();
    }
}
