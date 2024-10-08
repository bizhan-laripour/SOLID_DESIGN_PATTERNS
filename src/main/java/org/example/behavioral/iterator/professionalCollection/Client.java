package org.example.behavioral.iterator.professionalCollection;

public class Client {

    public static void main(String[] args) {

        CustomCollection<String> customCollection = new CustomCollection.Builder<>().setSize(100).build();
        customCollection.add("hello");
        customCollection.add("world");
        customCollection.add("i");
        customCollection.add("want");
        Iterator<String> iterator = new CustomIterator<>(customCollection);
        iterator.print();
    }
}
