package org.example.structural.bridge.abstractFactoryVsBridge;

public class Red implements ColorInterface{
    private String color;
    @Override
    public void fillColor() {
        this.color = "red";
    }

    @Override
    public void getColorName() {
        System.out.println("the color is " + this.color);
    }
}
