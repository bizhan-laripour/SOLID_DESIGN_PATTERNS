package org.example.behavioral.state;

public class Client {

    public static void main(String[] args) {

        Player samsungPlayer = new Player();
        State ui = new UI(samsungPlayer);
        System.out.println(ui.onPlay());
        System.out.println(ui.onNext());
        System.out.println(ui.onNext());
        System.out.println(ui.onPrevious());
        System.out.println(ui.onLock());
        System.out.println(ui.onNext());
    }
}
