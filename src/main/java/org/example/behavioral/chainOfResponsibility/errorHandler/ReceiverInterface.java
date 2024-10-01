package org.example.behavioral.chainOfResponsibility.errorHandler;

public interface ReceiverInterface {

    boolean processMessage(Message message);

    void setNextChain(ReceiverInterface nextChain);
}
