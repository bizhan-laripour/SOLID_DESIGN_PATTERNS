package org.example.ceational.singleton;

import org.example.ceational.singleton.billPugh.BillPugh;
import org.example.ceational.singleton.eager.Eager;
import org.example.ceational.singleton.lazy.Lazy;
import org.example.ceational.singleton.synchronize.SyncronizedSingleton;

public class SingletonMain {

    public static void main(String[] args) {

        Lazy lazy = Lazy.getInstance();
        Lazy lazy2 = Lazy.getInstance();
        System.out.println(lazy2 == lazy);


        Eager eager = Eager.getInstance();
        Eager eager2 = Eager.getInstance();
        System.out.println(eager == eager2);

        SyncronizedSingleton singleton = SyncronizedSingleton.getInstance();
        SyncronizedSingleton singleton2 = SyncronizedSingleton.getInstance();
        System.out.println(singleton == singleton2);

        BillPugh billPugh = BillPugh.getInstance();
        BillPugh billPugh2 = BillPugh.getInstance();
        System.out.println(billPugh == billPugh2);
    }
}
