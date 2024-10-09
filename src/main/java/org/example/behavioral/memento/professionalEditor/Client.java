package org.example.behavioral.memento.professionalEditor;

public class Client {

    public static void main(String[] args) {
        Receiver editor = new Editor("text.txt");
        Command write = new WriteCommand(editor);
        write.execute("hello bizhan\n");
        Command save = new SaveCommand(editor);
        Object memento = save.execute(editor);
        write.execute("babak laripour");

        save.execute(editor);
        Command roleBack = new RestoreCommand(editor);
        roleBack.execute(memento);

        System.out.println(editor);


    }
}
