package org.example.behavioral.memento.textEditort;

public class CareTaker {

    private Object object;

    public void save(FileWriterUtil fileWriterUtil){
        this.object = fileWriterUtil.save();
    }

    public void undo(FileWriterUtil fileWriterUtil){
        fileWriterUtil.undoToLastSave(object);
    }
}
