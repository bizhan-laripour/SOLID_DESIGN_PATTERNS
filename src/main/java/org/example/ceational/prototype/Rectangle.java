package org.example.ceational.prototype;

public class Rectangle extends Shape {

    public Rectangle() {
        super.setName("rectangle");
        super.setId("1");
    }
    @Override
    void draw() {
        System.out.println("draw rectangle");
    }


}
