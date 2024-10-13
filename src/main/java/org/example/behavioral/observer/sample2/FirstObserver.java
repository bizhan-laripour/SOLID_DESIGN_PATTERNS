package org.example.behavioral.observer.sample2;

public class FirstObserver implements Observer{

    private Subject subject;

    @Override
    public void invoke(String message) {
        System.out.println("FirstObserver invoked: " + subject.update(message));
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }
}
