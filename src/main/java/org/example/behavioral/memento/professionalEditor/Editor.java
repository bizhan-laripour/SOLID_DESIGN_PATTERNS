package org.example.behavioral.memento.professionalEditor;

public class Editor extends Receiver{


    public Editor(String fileName) {
       super(fileName);
    }

    @Override
    public SnapShot save() {
        return new SnapShot(super.fileName , this.content);
    }

    @Override
    public Object restore(Object object) {
        SnapShot snapShot = (SnapShot) object;
        this.content = snapShot.content;
        this.fileName = snapShot.fileName;
        return snapShot;
    }

    @Override
    public Object write(String content) {
       return super.content.append(content);
    }


    @Override
    public String toString() {
        return super.content.toString();
    }

}
