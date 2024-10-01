package org.example.behavioral.iterator.professionalCollection;

public interface Iterator<T> {

    boolean hasNext();

    T next();

    default void print(){
        while(hasNext()){
            System.out.println(next());
        }
    }

}
