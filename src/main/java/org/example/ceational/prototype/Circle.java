package org.example.ceational.prototype;

public class Circle extends Shape {

    public Circle() {
        super.setId("2");
        super.setName("Circle");
    }

    @Override
    void draw() {
        System.out.println("draw circle");
    }
}
