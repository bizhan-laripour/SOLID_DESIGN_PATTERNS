package org.example.ceational.factory.abstractFactory;

public class ShapeFactory extends AbstractFactory{
    @Override
    public Shape getShape(String shape) {
        return switch (shape) {
            case "Rectangle" -> new Rectangle();
            case "Circle" -> new Circle();
            default -> null;
        };
    }

    @Override
    public final Color getColor(String color) {
      return null;
    }
}
