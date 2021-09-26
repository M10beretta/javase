package com.mber.topic.core.alishev.lesson45_serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject {
    public static void main(String[] args) {

        try {
            FileInputStream fis = new FileInputStream("D:\\Study" +
                    "\\programming\\practice\\src\\com.mber.topic.multithreading.alishev\\" +
                    "beginner\\lesson45serialization\\people.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Person person1 = (Person) ois.readObject();
            Person person2 = (Person) ois.readObject();

            ois.close();

            System.out.println(person1);
            System.out.println(person2);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
