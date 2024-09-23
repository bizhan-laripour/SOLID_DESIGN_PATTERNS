package org.example.structural.bridge.abstractFactoryVsBridge;

public class Green implements ColorInterface{

    private String color;


    @Override
    public void fillColor() {
        this.color = "green";
    }

    @Override
    public void getColorName() {
        System.out.println("the color is : " + this.color);
    }
}
