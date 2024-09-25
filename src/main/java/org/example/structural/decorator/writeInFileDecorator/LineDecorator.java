package org.example.structural.decorator.writeInFileDecorator;

import java.io.BufferedWriter;
import java.io.IOException;

public class LineDecorator extends FileWriterDecorator{


    public LineDecorator(BaseComponent baseComponent) {
        super(baseComponent);
    }

    @Override
    public String insertElement() throws IOException {
        return super.insertElement() +"\n" + "---------------------------------------------";
    }
}
