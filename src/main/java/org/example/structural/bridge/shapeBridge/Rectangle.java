package org.example.structural.bridge.shapeBridge;

public class Rectangle extends Shape {

    private double width;

    private Rectangle(Color color , double width) {
        super(color);
        this.width = width;

    }

    @Override
    public void area() {
        double area = width * width;
        System.out.println("Area of Rectangle is:" +area);
    }

    @Override
    public void draw() {
        System.out.println("Drawing Rectangle is:" +width);
    }

    static class Builder {
        private double width;
        private Color color;
        public Builder width(double width) {
            this.width = width;
            return this;
        }
        public Builder color(Color color) {
            this.color = color;
            return this;
        }
        public Rectangle build() {
            return new Rectangle(color , width);
        }
    }
}
