package org.example.structural.bridge.shapeBridge;

public class Triangle extends Shape {

    private double width;

    private double height;

    private Triangle(Color color , double width , double height) {
        super(color);
        this.width = width;
        this.height = height;
    }


    @Override
    public void area() {
        double area = (width * height)/2;
        System.out.println("Area of Triangle is:"+ area);
    }

    @Override
    public void draw() {
        System.out.println("Drawing Triangle "+width+"*"+height);
    }

    static class Builder{
        private double width;

        private double height;
        private Color color;

        public Builder width(double width) {
            this.width = width;
            return this;
        }
        public Builder height(double height) {
            this.height = height;
            return this;
        }
        public Builder color(Color color) {
            this.color = color;
            return this;
        }
        public Triangle build() {
            return new Triangle(color , width , height);
        }
    }
}
