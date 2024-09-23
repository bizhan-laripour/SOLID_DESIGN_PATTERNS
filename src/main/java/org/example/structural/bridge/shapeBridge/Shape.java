package org.example.structural.bridge.shapeBridge;

public abstract class Shape {

    private final Color color;

    protected Shape(Color color) {
        this.color = color;
    }

    public abstract void area();

    public abstract void draw();

    public void getColor() {
        color.getColor();
    }

}
