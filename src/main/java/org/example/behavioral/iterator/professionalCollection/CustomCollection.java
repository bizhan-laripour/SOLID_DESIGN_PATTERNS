package org.example.behavioral.iterator.professionalCollection;

import java.util.Arrays;

public class CustomCollection<T> implements Collection<T> {

    private T[] list;
    private int size;
    private int numberOfItems = 0;


    private CustomCollection(int size) {
        this.size = size;
        list = (T[]) new Object[size];
    }



    public T add(T element) {
        if(numberOfItems < size) {
            list[numberOfItems] = element;
            numberOfItems++;
            return element;
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public void remove(int index) {
        if(index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException();
        }
        Arrays.stream(list).toList().remove(index);
    }

    @Override
    public void setList(T[] list) {
        list = (T[]) new Object[size];
    }

    @Override
    public T[] getList() {
        return list;
    }

    public static class Builder<T> {
        private int size;

        public Builder setSize(int size) {
            this.size = size;
            return this;
        }

        public CustomCollection<T> build() {
            return new CustomCollection<T>(size);
        }
    }
}
