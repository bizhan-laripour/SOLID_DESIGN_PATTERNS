package org.example.behavioral.chainOfResponsibility.notifier;

public class EndOfChain extends Notify{

    public EndOfChain(Priority priority) {
        super(priority);
    }

    @Override
    public void notify(Message message) {
        System.out.println("End of chain");
    }
}
