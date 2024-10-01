package org.example.behavioral.chainOfResponsibility.notifier;

public class EmailNotifier extends Notify{

    private final Notify notify;

    private EmailNotifier(Notify notify , Priority priority) {
        super(priority);
        this.notify = notify;

    }

    @Override
    public void notify(Message message) {
        System.out.println("connecting to Email provider ....");
        try {
            Thread.sleep(3000);
            System.out.println("Email Notifier: Sending email...");
            Thread.sleep(1000);
            System.out.println("Email Sent Successfully: "+message.getMessage() + " "+ message.getCode() + " "+super.getPriority().getPriority().name());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        notify.notify(message);
    }

    public static class Builder {
        private Notify notify;
        private Priority priority;

        public Builder setNotify(Notify notify) {
            this.notify = notify;
            return this;
        }
        public Builder setPriority(Priority priority) {
            this.priority = priority;
            return this;
        }
        public EmailNotifier build() {
            return new EmailNotifier(notify, priority);
        }
    }

}
