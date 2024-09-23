package org.example.structural.bridge.abstractFactoryVsBridge;

public class ShapeFactory extends AbstractFactory {


    @Override
    public ShapeInterface getShape(String shapeName) {
        return switch (shapeName) {
            case "rectangle" -> new Rectangle();
            case "triangle" -> new Triangle();
            default -> null;
        };
    }

    @Override
    public ColorInterface getColor(String colorName) {
        return null;
    }
}
