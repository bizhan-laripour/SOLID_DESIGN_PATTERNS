package org.example.ceational.builder;

public class Computer {
    private final String computerName;
    private final String computerType;
    private final String computerSize;
    private Computer(String computerName, String computerType, String computerSize) {
        this.computerName = computerName;
        this.computerType = computerType;
        this.computerSize = computerSize;
    }

    public String getComputerName() {
        return computerName;
    }

    public String getComputerType() {
        return computerType;
    }

    public String getComputerSize() {
        return computerSize;
    }

    public static class Builder{
        private String computerName;
        private String computerType;
        private String computerSize;


        public Builder setComputerName(String computerName) {
            this.computerName = computerName;
            return this;
        }

        public Builder setComputerType(String computerType) {
            this.computerType = computerType;
            return this;
        }

        public Builder setComputerSize(String computerSize) {
            this.computerSize = computerSize;
            return this;
        }

        public Computer build(){
            return new Computer(computerName, computerType, computerSize);
        }
    }

}
