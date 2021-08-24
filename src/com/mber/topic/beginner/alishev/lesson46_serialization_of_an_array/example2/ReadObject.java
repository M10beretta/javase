package com.mber.topic.beginner.alishev.lesson46_serialization_of_an_array.example2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class ReadObject {
    public static void main(String[] args) {

        try {
            FileInputStream fis = new FileInputStream("D:\\Study\\" +
                    "programming\\practice\\src\\com.mber.alishev\\" +
                    "beginner\\lesson46serializingAnArray\\_\\people.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Person[] people = (Person[]) ois.readObject();

            System.out.println(Arrays.toString(people));

            ois.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
