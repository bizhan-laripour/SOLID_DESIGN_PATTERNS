package org.example.behavioral.memento.textEditort;

public class Client {

    public static void main(String[] args) {
        FileWriterUtil fileWriterUtil = new FileWriterUtil("hello.txt");
        fileWriterUtil.write("hello world \n");
        System.out.println(fileWriterUtil);

        CareTaker careTaker = new CareTaker();
        careTaker.save(fileWriterUtil);

        fileWriterUtil.write("bizhan laripour");
        System.out.println(fileWriterUtil);

        //undo
        careTaker.undo(fileWriterUtil);
        System.out.println(fileWriterUtil);
        careTaker.undo(fileWriterUtil);

    }
}
