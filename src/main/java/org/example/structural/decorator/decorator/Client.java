package org.example.structural.decorator.decorator;

public class Client {

    public static void main(String[] args) {
        Decorator decorator = new Decorator(new ConcreteDecoratorExample1(new ConcreteDecoratorExample2(new ConcreteComponent())));
        decorator.operation();
    }
}
