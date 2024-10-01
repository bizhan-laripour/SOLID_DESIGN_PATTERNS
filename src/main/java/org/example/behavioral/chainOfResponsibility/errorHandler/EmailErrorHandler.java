package org.example.behavioral.chainOfResponsibility.errorHandler;

public class EmailErrorHandler implements ReceiverInterface{

    private ReceiverInterface nextReceiver;

    @Override
    public boolean processMessage(Message message) {
        if (message.getMessage().contains("Email")) {
            System.out.println("EmailErrorHandler processed "+ message.getMessage());
            return true;
        }else {
            if (nextReceiver != null) {
                nextReceiver.processMessage(message);
            }
        }
        return false;
    }

    @Override
    public void setNextChain(ReceiverInterface nextChain) {
        this.nextReceiver = nextChain;
    }
}
