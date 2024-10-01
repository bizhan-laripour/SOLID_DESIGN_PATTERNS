package org.example.behavioral.iterator.professionalCollection;

public class CustomIterator<T> implements Iterator<T> {


    private int index;

    private Collection<T> collection;

    public CustomIterator(Collection<T> collection) {
        this.collection = collection;
    }
    @Override
    public boolean hasNext() {
        return index < collection.getList().length && collection.getList()[index] != null;
    }

    @Override
    public T next() {
        T result = collection.getList()[index];
        index += 1;
        return result;
    }


}
