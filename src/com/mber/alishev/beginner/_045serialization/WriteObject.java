package com.mber.alishev.beginner._045serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {
        Person person1 = new Person(1, "Bob");
        Person person2 = new Person(2, "Mike");

        try {
            FileOutputStream fos = new FileOutputStream("D:\\Study\\" +
                    "programming\\practice\\src\\com.mber.alishev\\" +
                    "beginner\\_045serialization\\people.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(person1);
            oos.writeObject(person2);

            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
