package org.example.structural.composite;

public class Client {

    public static void main(String[] args) {
        Employee developer = new Developer.Builder().setEmployeeId(100).setName("bizhan").setPosition("developer").setSalary(6000).build();
        Employee developer2 = new Developer.Builder().setEmployeeId(101).setName("james").setPosition("developer").setSalary(6000).build();
        Employee manager = new Manager.Builder().setEmployeeId(200).setName("david").setPosition("manager").setSalary(100000).build();
        Employee manager2 = new Manager.Builder().setEmployeeId(201).setName("max").setPosition("manager").setSalary(20000).build();

        Directory engineering = new Directory();
        engineering.addEmployee(developer);
        engineering.addEmployee(developer2);

        Directory accounting = new Directory();
        accounting.addEmployee(manager);
        accounting.addEmployee(manager2);

        Directory company = new Directory();
        company.addEmployee(engineering);
        company.addEmployee(accounting);
        company.removeEmployee(engineering);
        company.getSumOfSalaries();
    }
}
