package org.example.structural.decorator.writeInFileDecorator;

import java.io.BufferedWriter;

public class ConcreteBaseComponent implements BaseComponent{



    @Override
    public String insertElement() {
        return  "hello this line comes from BaseComponent";

    }

}
