package com.mber.topic.beginner.alishev.lesson46_serialization_of_an_array.example3;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class ReadObject {
    public static void main(String[] args) {

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(
                "D:\\Study\\programming\\practice\\src\\" +
                        "com.mber.alishev\\beginner\\lesson46serializingAnArray\\method3\\people.bin"))){

            Person[] people = (Person[]) ois.readObject();

            System.out.println(Arrays.toString(people));

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
