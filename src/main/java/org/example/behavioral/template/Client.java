package org.example.behavioral.template;

public class Client {

    public static void main(String[] args) throws InterruptedException {
        Demo demo = new Demo(new Twitter("bizhan.lp" , "8830183"));
        demo.post("hello");
    }
}
