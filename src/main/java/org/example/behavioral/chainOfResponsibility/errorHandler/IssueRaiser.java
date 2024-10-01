package org.example.behavioral.chainOfResponsibility.errorHandler;

public class IssueRaiser {

    private final ReceiverInterface firstReceiver;


    public IssueRaiser(ReceiverInterface firstReceiver) {
        this.firstReceiver = firstReceiver;
    }

    public void raiseMessage(Message message) {
        if (firstReceiver != null) {
            firstReceiver.processMessage(message);
        }
    }
}
