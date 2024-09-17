package org.example.ceational.factory.simpleFactory;

public class BookFactory extends Factory {
    @Override
    public Product createProduct() {
        return new Book();
    }
}
