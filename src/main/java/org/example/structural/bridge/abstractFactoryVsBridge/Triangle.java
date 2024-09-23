package org.example.structural.bridge.abstractFactoryVsBridge;

public class Triangle extends ShapeInterface{

    private  double height;
    private  double width;



    private void setHeight(double height) {
        this.height = height;
    }

    private void setWidth(double width) {
        this.width = width;
    }

    public void populate(double height, double width) {
        setHeight(height);
        setWidth(width);
    }

    @Override
    public void draw() {
        System.out.println("Triangle drawn " + height+" "+ width);
    }

    @Override
    public void area() {
        double area = (width * height)/2;
        System.out.println("Triangle area " + area);
    }
}
