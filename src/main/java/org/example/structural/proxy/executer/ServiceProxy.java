package org.example.structural.proxy.executer;

public class ServiceProxy implements ServiceInterface{

    private ServiceInterface serviceInterface;

    @Override
    public void execute() {
        checkValidation();
    }

    private void checkValidation(){
        if(serviceInterface == null){
            serviceInterface = new Service();
        }
        serviceInterface.execute();
    }
}
