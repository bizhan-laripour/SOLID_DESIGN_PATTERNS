package org.example.behavioral.chainOfResponsibility.notifier;


/**
 * chain of responsibility and builder and bridge pattern
 */
public class Client {
    public static void main(String[] args) {


        Notify notifier = new EmailNotifier.Builder().
                setPriority(new LowPriority()).setNotify(new SmsNotifier.Builder().setPriority(new MediumPriority()).setNotify(new EndOfChain(null)).build())
                .build();
        notifier.notify(new Message.Builder().setMessage("Hello World!").setCode("55").build());
    }
}
