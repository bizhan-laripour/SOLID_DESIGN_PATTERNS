package org.example.structural.decorator.writeInFileDecorator;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Client {

    public static void main(String[] args) throws IOException {
        FileWriterDecorator fileWriterDecorator =
                new FileWriterDecorator(new NextLineDecorator(new LineDecorator(new NextLineDecorator(new LineDecorator(new ConcreteBaseComponent())))));
        fileWriterDecorator.setBufferedWriter(new BufferedWriter(new FileWriter("D:\\lp.txt")));
        fileWriterDecorator.write();
    }
}
