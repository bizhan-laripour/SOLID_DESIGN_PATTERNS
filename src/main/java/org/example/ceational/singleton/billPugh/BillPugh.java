package org.example.ceational.singleton.billPugh;

public class BillPugh {

    private BillPugh(){

    }

    private static class Helper{
        private final static BillPugh instance = new BillPugh();
    }

    public static BillPugh getInstance(){
        return Helper.instance;
    }
}
