package org.example.ceational.factory.simpleFactory2;

public class Factory2 {

    public Product getProduct(String productName) throws Exception {
        switch (productName){
            case "Book" : return new Book();
            case "Phone" : return new Phone();
            default: throw new Exception("type mismatch");
        }
    }
}
