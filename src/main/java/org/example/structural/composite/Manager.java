package org.example.structural.composite;

public class Manager implements Employee {
    private final String name;
    private final String position;
    private final long employeeId;
    private final int salary;

    private Manager(String name, String position, long employeeId, int salary) {
        this.name = name;
        this.position = position;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    @Override
    public int showEmployeeDetails() {
        return salary;
    }

    static class Builder {

        private String name;
        private String position;
        private long employeeId;
        private int salary;


        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setPosition(String position) {
            this.position = position;
            return this;
        }

        public Builder setEmployeeId(long employeeId) {
            this.employeeId = employeeId;
            return this;
        }

        public Builder setSalary(int salary) {
            this.salary = salary;
            return this;
        }

        public Manager build() {
            return new Manager(name, position, employeeId, salary);
        }
    }
}
