package org.example.structural.bridge.abstractFactoryVsBridge;

public class Rectangle extends ShapeInterface {

    private  double width;
    private  double height;



    private void setWidth(double width) {
        this.width = width;
    }

    private void setHeight(double height) {
        this.height = height;
    }

    public void populate(double width, double height) {
        setWidth(width);
        setHeight(height);
    }

    @Override
    public void draw() {
        System.out.println("draw rectangle :" + width + "x" + height);
    }

    @Override
    public void area() {
        System.out.println("area rectangle :" + width * height);
    }

}
