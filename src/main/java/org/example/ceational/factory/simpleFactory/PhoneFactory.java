package org.example.ceational.factory.simpleFactory;

public class PhoneFactory extends Factory {
    @Override
    public Product createProduct() {
        return new Phone();
    }
}
