package org.example.ceational.factory.simpleFactory;

public abstract class Factory {

    protected abstract Product createProduct();

    public Product getProduct(){
        return createProduct();
    }
}
