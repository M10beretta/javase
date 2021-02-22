package com.mber.javarush.task.task20.task2020.method1;

import java.io.*;
import java.util.logging.Logger;

/*
Сериализация человека
*/

public class Solution {

    public static class Person implements Serializable {
        String firstName;
        String lastName;
        transient String fullName;
        transient final String greeting;
        String country;
        Sex sex;
        transient PrintStream outputStream;
        transient Logger logger;

        Person(String firstName, String lastName, String country, Sex sex) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.fullName = String.format("%s, %s", lastName, firstName);
            this.greeting = "Hello, ";
            this.country = country;
            this.sex = sex;
            this.outputStream = System.out;
            this.logger = Logger.getLogger(String.valueOf(Person.class));
        }

        @Override
        public String toString() {
            return "Person{" +
                    "firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", fullName='" + fullName + '\'' +
                    ", greeting='" + greeting + '\'' +
                    ", country='" + country + '\'' +
                    ", sex=" + sex +
                    ", outputStream=" + outputStream +
                    '}';
        }
    }

    enum Sex {
        MALE,
        FEMALE
    }

    public static void main(String[] args) {

        Person personSave = new Person("Mike", "Moody", "USA", Sex.MALE);
        System.out.println(personSave);

        final String file = "D:\\Study\\programming\\practice\\src\\com.mber.javarush\\counter\\task2020\\method0\\file.ser";
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file));
             ObjectInputStream in = new ObjectInputStream(new FileInputStream(file))) {
            out.writeObject(personSave);
            Person personLoad = (Person)in.readObject();
            System.out.println(personLoad);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
