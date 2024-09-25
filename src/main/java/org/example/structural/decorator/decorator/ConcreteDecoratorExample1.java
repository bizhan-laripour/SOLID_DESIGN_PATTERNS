package org.example.structural.decorator.decorator;

public class ConcreteDecoratorExample1 extends Decorator {

    protected ConcreteDecoratorExample1(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        System.out.println("i am example 1");
    }
}
