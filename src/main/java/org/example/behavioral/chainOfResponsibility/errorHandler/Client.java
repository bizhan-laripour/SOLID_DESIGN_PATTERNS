package org.example.behavioral.chainOfResponsibility.errorHandler;

public class Client {

    public static void main(String[] args) {
        ReceiverInterface fax = new FaxErrorHandler();
        ReceiverInterface email = new EmailErrorHandler();

        fax.setNextChain(email);
        IssueRaiser issueRaiser = new IssueRaiser(fax);
        issueRaiser.raiseMessage(new Message("Fax Email" , MessagePriority.HIGH));
    }
}
