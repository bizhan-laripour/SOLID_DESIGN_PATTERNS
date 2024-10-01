package org.example.behavioral.command.basicCommand;

public class Client {

    public static void main(String[] args) {
        Receiver receiver = new UnixFileSystemReceiver();
        Command closeFileCommand = new CloseFileCommand(receiver);
        Command openCommand = new OpenFileCommand(receiver);
        Command writeCommand = new WriteFileCommand(receiver);
        Invoker invoker = new Invoker(openCommand);
        invoker.execute();
    }
}
