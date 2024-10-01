package org.example.behavioral.iterator.customCollection;

public class BizhanIterator<T> implements  Iterator<T>{

    private final T[] list;
    int pos = 0;

    public BizhanIterator(T[] list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return pos < list.length && list[pos] != null;
    }

    @Override
    public T next() {
        T next = list[pos];
        pos += 1;
        return next;
    }
}
