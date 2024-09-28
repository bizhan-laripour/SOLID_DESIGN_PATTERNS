package org.example.structural.proxy.executer;

public class Service implements ServiceInterface{

    private String name = "Service Name";

    @Override
    public void execute() {
        System.out.println(before());
        System.out.println(name);
        System.out.println(after());
    }


    private String before(){
        return "before";
    }

    private String after(){
        return "after";
    }

}
