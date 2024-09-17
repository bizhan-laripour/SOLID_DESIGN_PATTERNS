package org.example.ceational.factory;

import org.example.ceational.factory.simpleFactory.BookFactory;
import org.example.ceational.factory.simpleFactory.Factory;
import org.example.ceational.factory.simpleFactory.PhoneFactory;
import org.example.ceational.factory.simpleFactory2.Factory2;

public class FactoryMain {

    public static void main(String[] args) throws Exception {
        Factory factory = new BookFactory();
        factory.getProduct().nameAndPrice();

        Factory factory1 = new PhoneFactory();
        factory1.getProduct().nameAndPrice();

        ///////////////////////////////////////////////

        Factory2 factory2 = new Factory2();
        factory2.getProduct("Book").nameAndPrice();
        factory2.getProduct("Phone").nameAndPrice();
    }
}
