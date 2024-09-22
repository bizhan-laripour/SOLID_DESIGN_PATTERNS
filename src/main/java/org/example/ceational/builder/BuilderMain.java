package org.example.ceational.builder;

public class BuilderMain {

    public static void main(String[] args) {
        Computer computer = new Computer.Builder().setComputerName("bizhan")
                .setComputerSize("10")
                .setComputerType("hello").build();

        System.out.println(computer.getComputerName());
        System.out.println(computer.getComputerSize());
        System.out.println(computer.getComputerType());
    }
}
