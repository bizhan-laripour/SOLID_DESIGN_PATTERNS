package org.example.ceational.factory.abstractFactory;

public class ColorFactory extends AbstractFactory {
    @Override
    public final Shape getShape(String shape) {
        return null;
    }

    @Override
    public Color getColor(String color) {
        return switch (color){
            case "Red" -> new Red();
            case "Green" -> new Green();
            default -> null;
        };
    }
}
