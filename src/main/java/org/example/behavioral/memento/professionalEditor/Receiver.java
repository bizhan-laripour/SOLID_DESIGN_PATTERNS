package org.example.behavioral.memento.professionalEditor;

public abstract class Receiver {

    protected String fileName;
    protected StringBuilder content;

    public Receiver(String fileName) {
        this.fileName = fileName;
        this.content = new StringBuilder();
    }

    public abstract SnapShot save();

    public abstract Object restore(Object object);

    public abstract Object write(String content);

    public class SnapShot{

        protected String fileName;
        protected StringBuilder content;

        public SnapShot(String fileName, StringBuilder content) {
            this.fileName = fileName;
            this.content = new StringBuilder(content);
        }
    }


}
