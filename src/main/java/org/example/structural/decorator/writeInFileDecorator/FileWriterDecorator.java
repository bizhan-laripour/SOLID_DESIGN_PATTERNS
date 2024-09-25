package org.example.structural.decorator.writeInFileDecorator;

import java.io.BufferedWriter;
import java.io.IOException;

public class FileWriterDecorator implements BaseComponent{

    private final BaseComponent baseComponent;
    private BufferedWriter bufferedWriter;



    public FileWriterDecorator(BaseComponent baseComponent) {
        this.baseComponent = baseComponent;
    }

    @Override
    public String insertElement() throws IOException {
        return baseComponent.insertElement();
    }

    public void setBufferedWriter(BufferedWriter bufferedWriter) {
        this.bufferedWriter = bufferedWriter;
    }

    public void write() throws IOException {
        bufferedWriter.write(baseComponent.insertElement());
        bufferedWriter.close();
    }


}
