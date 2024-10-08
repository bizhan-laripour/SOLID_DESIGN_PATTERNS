package org.example.behavioral.observer.sample;

public class Client {

    public static void main(String[] args) {

        Observer observer = new MyTopicSubscriber("TOPIC_1");
        Subject subject = new MyTopic();
        observer.setSubject(subject);

        subject.registerObserver(observer);
        subject.postMessage("hello to you");
        subject.postMessage("hello to you");
        subject.postMessage("hello to you");
    }


}
