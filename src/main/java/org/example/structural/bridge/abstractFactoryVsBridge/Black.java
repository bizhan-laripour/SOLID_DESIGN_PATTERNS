package org.example.structural.bridge.abstractFactoryVsBridge;

public class Black implements ColorInterface{

    private String color;

    @Override
    public void fillColor() {
        this.color = "black";
    }

    @Override
    public void getColorName() {
        System.out.println("color is : " + this.color);
    }
}
