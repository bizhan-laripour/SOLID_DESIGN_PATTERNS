package org.example.behavioral.iterator.customCollection;

public class BizhanCollection<T> implements Collection<T> {

    private static final int MAX_ITEMS = 6;
    private int numberOfItems = 0;
    private T[] list;


    public BizhanCollection() {
        list = (T[]) new Object[MAX_ITEMS];
    }

    @Override
    public Iterator<T> createIterator() {
        return new BizhanIterator<>(list);
    }

    public void add(T element) {
        if (numberOfItems >= MAX_ITEMS) {
            throw new ArrayIndexOutOfBoundsException();
        }
        list[numberOfItems] = element;
        numberOfItems++;
    }
}
