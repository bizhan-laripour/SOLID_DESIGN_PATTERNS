package org.example.structural.bridge.abstractFactoryVsBridge;

public class FactoryGenerator {


    public static AbstractFactory getFactory(String factoryType) {
        return switch (factoryType) {
            case "color" -> new ColorFactory();
            case "shape" -> new ShapeFactory();
            default -> null;
        };
    }



}
