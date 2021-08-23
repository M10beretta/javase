package com.mber.husivm.patterns.lesson271_factory_method;

// Factory Method
// создание объекта через метод

public class FactoryMethodLesson {
    public static void main(String[] args) {
        Person.create();
    }
}

class Person {
    // приватный конструктор
    private Person() {
    }
    // статический метод для создания объекта
    public static Person create() {
        return new Person();
    }

}


