package org.example.behavioral.strategy;

public class Client {


    public static void main(String[] args) {
        Animal strategyAnimal = new AnimalStrategy(new Cat());
        strategyAnimal.eat();
        strategyAnimal.sleep();
        strategyAnimal.voice();
    }
}
