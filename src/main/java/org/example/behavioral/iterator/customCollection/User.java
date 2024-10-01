package org.example.behavioral.iterator.customCollection;

public class User {
    private String name;
    private int age;

    private User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public  static class Builder {

        private String name;
        private int age;
        public Builder setName(String name) {
            this.name = name;
            return this;
        }
        public Builder setAge(int age) {
            this.age = age;
            return this;
        }
        public User build() {
            return new User(name, age);
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
