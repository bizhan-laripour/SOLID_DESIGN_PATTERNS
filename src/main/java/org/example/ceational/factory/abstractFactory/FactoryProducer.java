package org.example.ceational.factory.abstractFactory;

public class FactoryProducer {

    public static AbstractFactory getFactory(String factoryName) {
        return switch (factoryName){
            case "Color" -> new ColorFactory();
            case "Shape" -> new ShapeFactory();
            default -> null;
        };
    }
}
