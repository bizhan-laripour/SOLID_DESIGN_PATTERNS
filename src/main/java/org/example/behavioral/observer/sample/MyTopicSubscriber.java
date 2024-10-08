package org.example.behavioral.observer.sample;

public class MyTopicSubscriber implements Observer{

    private String name;

    private Subject topic;

    public MyTopicSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        String message = (String) topic.getUpdate(this);
        if(message != null) {
            System.out.println(name + ": consuming message " + message);
        }else {
            System.out.println(name + ": no message");
        }
    }

    @Override
    public void setSubject(Subject subject) {
        this.topic = subject;
    }
}
