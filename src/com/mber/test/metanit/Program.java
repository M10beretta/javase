package com.mber.test.metanit;

public class Program {

    public static void main(String[] args) {

        Person tom = new Person("Tom", 23);
        tom.display();      // Person Tom
        Person bob = tom;
        bob.setName("Bob");
        tom.display();      // Person Bob
    }
}

class Person {
    private String name;
    private int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void setName(String name) {
        this.name = name;
    }

    void setAge(int age) {
        this.age = age;
    }

    void display() {
        System.out.printf("Person Name: %s \n", name);
    }
}