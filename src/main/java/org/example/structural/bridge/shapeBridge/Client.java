package org.example.structural.bridge.shapeBridge;

public class Client {

    public static void main(String[] args) {
        Color green = new Green();
        Color red = new Red();
        Shape rectangle = new Rectangle.Builder().width(5).color(green).build();
        rectangle.draw();
        rectangle.area();
        rectangle.getColor();

        Shape triangle = new Triangle.Builder().width(3).height(2).color(red).build();
        triangle.draw();
        triangle.area();
        triangle.getColor();
    }
}
