package org.example.behavioral.command.basicCommand;

public class WindowsFileSystemReceiver implements Receiver{

    @Override
    public void openFile() {
        System.out.println("windows filesystem receiver opened");
    }

    @Override
    public void closeFile() {
        System.out.println("windows filesystem receiver closed");
    }

    @Override
    public void writeFile() {
        System.out.println("windows filesystem receiver written");
    }
}
