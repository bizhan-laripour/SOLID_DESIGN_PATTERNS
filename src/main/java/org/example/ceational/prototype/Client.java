package org.example.ceational.prototype;

public class Client {

    public static void main(String[] args) {
        ShapeCash.populate();

        Shape clonedShape = ShapeCash.getShape("1");
        Shape shape = ShapeCash.GetFromHashTable("1");
        System.out.println(clonedShape.getName());
        System.out.println(shape == clonedShape);


        Shape clonedShape2 = ShapeCash.getShape("2");
        Shape shape2 = ShapeCash.GetFromHashTable("2");
        System.out.println(clonedShape2.getName());
        System.out.println(shape2 == clonedShape2);
    }
}
