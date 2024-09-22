package org.example.ceational.prototype;

import java.util.Hashtable;

public class ShapeCash {
    private static Hashtable<String , Shape> hashtable = new Hashtable<>();

    public static Shape getShape(String id) {
        Shape shape = hashtable.get(id);
        return (Shape) shape.clone();
    }

    public static void populate(){
        Circle circle = new Circle();
        hashtable.put (circle.getId(), circle);
        Rectangle rectangle = new Rectangle();
        hashtable.put (rectangle.getId(), rectangle);
    }

    public static Shape GetFromHashTable(String id){
        return hashtable.get(id);

    }
}
