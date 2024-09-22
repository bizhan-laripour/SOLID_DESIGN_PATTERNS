package org.example.structural.adapter.objectAdapter;

public class Client {
    public static void main(String[] args) {
        Duck mallardDuck = new MalardDock();
        Turkey wildTurkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(wildTurkey);

        System.out.println("original duck will say :");
        mallardDuck.quack();
        mallardDuck.fly();

        System.out.println("wild turkey will say :");
        wildTurkey.gobble();
        wildTurkey.fly();

        System.out.println("a dock acts like a turkey ");
        turkeyAdapter.fly();
        turkeyAdapter.quack();


    }
}
