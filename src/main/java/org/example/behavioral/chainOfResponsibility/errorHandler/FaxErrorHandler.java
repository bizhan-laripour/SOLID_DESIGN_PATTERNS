package org.example.behavioral.chainOfResponsibility.errorHandler;

public class FaxErrorHandler implements ReceiverInterface{

    private ReceiverInterface receiver;

    @Override
    public boolean processMessage(Message message) {
        if(message.getMessage().contains("Fax")){
            System.out.println("Fax errorHandler processed "+ message.getMessage());
            return true;
        }else {
            if (receiver != null){
                receiver.processMessage(message);
            }
        }
        return false;
    }

    @Override
    public void setNextChain(ReceiverInterface nextChain) {
        this.receiver = nextChain;
    }
}
