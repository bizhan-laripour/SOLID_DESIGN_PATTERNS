package org.example.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

public class CompoundShape implements Shape{

    public int id;
    public List<Shape> children = new ArrayList<>();

    public CompoundShape(int id) {
        this.id = id;
    }

    @Override
    public void move(int x, int y) {
        // move shape
    }

    @Override
    public void draw() {
        //draw shape
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visitCompoundGraphic(this);
    }

    public void add(Shape shape) {
        children.add(shape);
    }

    public int getId() {
        return id;
    }
}
