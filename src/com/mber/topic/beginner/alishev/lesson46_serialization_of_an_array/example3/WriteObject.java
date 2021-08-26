package com.mber.topic.beginner.alishev.lesson46_serialization_of_an_array.example3;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {
        Person[] people = {new Person(1, "Bob"),
                new Person(2, "Mike"), new Person(3, "Jim")};
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(
                "D:\\Study\\programming\\practice\\src\\com.mber.topic.multithreading.alishev" +
                        "\\beginner\\lesson46serializingAnArray\\method3\\people.bin"))) {

            oos.writeObject(people);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
