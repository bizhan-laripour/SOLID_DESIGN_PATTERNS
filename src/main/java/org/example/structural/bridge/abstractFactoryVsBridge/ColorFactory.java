package org.example.structural.bridge.abstractFactoryVsBridge;


public class ColorFactory extends AbstractFactory {

    @Override
    public ShapeInterface getShape(String shape) {
        return null;
    }

    @Override
    public ColorInterface getColor(String color) {
        return switch (color) {
            case "red" -> new Red();
            case "green" -> new Green();
            default -> null;
        };
    }
}
