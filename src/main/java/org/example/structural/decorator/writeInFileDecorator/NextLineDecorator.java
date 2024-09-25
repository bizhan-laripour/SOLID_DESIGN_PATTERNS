package org.example.structural.decorator.writeInFileDecorator;

import java.io.IOException;

public class NextLineDecorator extends FileWriterDecorator{

    public NextLineDecorator(BaseComponent baseComponent) {
        super(baseComponent);
    }

    @Override
    public String insertElement() throws IOException {
        return super.insertElement() + "\n" + "this is next line";
    }
}
