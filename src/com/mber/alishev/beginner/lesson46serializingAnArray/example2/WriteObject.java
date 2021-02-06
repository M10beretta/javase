package com.mber.alishev.beginner.lesson46serializingAnArray.example2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {
        Person[] people = {new Person(1, "Bob"),
                new Person(2, "Mike"), new Person(3, "Den")};
        try {
            FileOutputStream fos = new FileOutputStream("D:\\Study\\" +
                    "programming\\practice\\src\\com.mber.alishev\\" +
                    "beginner\\lesson46serializingAnArray\\_\\people.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(people);

            oos.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
