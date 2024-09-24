package org.example.structural.bridge.abstractFactoryVsBridge;

public class Client {

    public static void main(String[] args) {

        AbstractFactory colorFactory = FactoryGenerator.getFactory("color");
        AbstractFactory shapeFactory = FactoryGenerator.getFactory("shape");

        ColorInterface red = colorFactory.getColor("red");
        red.fillColor();

        ColorInterface green = colorFactory.getColor("green");
        green.fillColor();

        ColorInterface black = colorFactory.getColor("black");
        black.fillColor();

        ShapeInterface rectangle = shapeFactory.getShape("rectangle");
        ShapeInterface triangle = shapeFactory.getShape("triangle");

        rectangle.setColorInterface(black);
        rectangle.populate(3 , 5);
        rectangle.show();

        triangle.setColorInterface(green);
        triangle.populate(2 , 5);
        triangle.show();
    }
}
