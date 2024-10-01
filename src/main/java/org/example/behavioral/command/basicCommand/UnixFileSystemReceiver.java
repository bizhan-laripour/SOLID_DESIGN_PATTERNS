package org.example.behavioral.command.basicCommand;

public class UnixFileSystemReceiver implements Receiver{


    @Override
    public void openFile() {
        System.out.println("open file for UnixFileSystemReceiver");
    }

    @Override
    public void closeFile() {
        System.out.println("close file for UnixFileSystemReceiver");
    }

    @Override
    public void writeFile() {
        System.out.println("write file for UnixFileSystemReceiver");
    }
}
