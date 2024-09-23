package org.example.structural.bridge.abstractFactoryVsBridge;

public abstract class AbstractFactory {

    public abstract ShapeInterface getShape(String shapeName);
    public abstract ColorInterface getColor(String colorName);

}
