package org.example.structural.bridge.abstractFactoryVsBridge;

public abstract class ShapeInterface {
    private ColorInterface colorInterface;
    public abstract void draw();
    public abstract void area();
    public abstract void populate(double width, double height);

    public void setColorInterface(ColorInterface colorInterface) {
        this.colorInterface = colorInterface;
    }

    public void getColorName(){
        colorInterface.getColorName();
    }

    public void show(){
        draw();
        area();
        getColorName();

    }
}
