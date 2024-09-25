package org.example.structural.decorator.decorator;

public class ConcreteDecoratorExample2 extends Decorator {

    protected ConcreteDecoratorExample2(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        System.out.println("i am ConcreteDecoratorExample2");
    }
}
