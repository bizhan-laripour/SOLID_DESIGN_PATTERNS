package org.example.behavioral.observer.sample2;

public class Client {

    public static void main(String[] args) {

        Subject subject = new MySubject("TOPIC_1" , "HELLO BIZHAN");
        FirstObserver observer = new FirstObserver();
        observer.setSubject(subject);
        subject.register(observer);
        subject.update("hiiiiiiii");
    }
}
