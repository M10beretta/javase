package com.mber.topic.beginner.alishev.lesson46_serialization_of_an_array.example1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {
        Person[] people = {new Person(1, "Bob"),
                new Person(2, "Mike"), new Person(3, "Tom")};

        try {
            FileOutputStream fos = new FileOutputStream("D:\\Study" +
                    "\\programming\\practice\\src\\com.mber.alishev" +
                    "\\beginner\\lesson46serializingAnArray\\method0\\people.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeInt(people.length);
            for (Person person : people) {
                oos.writeObject(person);
            }

            oos.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
