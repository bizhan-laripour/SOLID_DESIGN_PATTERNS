package org.example.behavioral.memento.textEditort;

public class FileWriterUtil {

    private String fileName;

    private StringBuilder content;

    public FileWriterUtil(String fileName) {
        this.fileName = fileName;
        content = new StringBuilder();
    }

    public void write(String text) {
        this.content.append(text);
    }

    public Memento save(){
        return new Memento(this.fileName, this.content);
    }

    public void undoToLastSave(Object o){
        Memento memento = (Memento) o;
        this.fileName = memento.fileName;
        this.content = memento.content;
    }


    private class Memento {

        private String fileName;
        private StringBuilder content;


        public Memento(String fileName, StringBuilder content) {
            this.fileName = fileName;
            this.content = new StringBuilder(content);
        }
    }

    @Override
    public String toString() {
        return this.content.toString();
    }


}
