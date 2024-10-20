package org.example.behavioral.visitor;

public class Circle extends Dot{

    private double radius;

    public Circle(int id, int x, int y, double radius) {
        super(id, x, y);
        this.radius = radius;
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visitCircle(this);
    }

    public double getRadius() {
        return radius;
    }
}
