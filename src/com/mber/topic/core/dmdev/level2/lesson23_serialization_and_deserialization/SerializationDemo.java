package com.mber.topic.core.dmdev.level2.lesson23_serialization_and_deserialization;

import java.io.*;
import java.nio.file.Path;

public class SerializationDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Path path = Path.of("src", "com", "mber", "dmdev", "level2", "lesson23", "student.out");
        writeObject(path);
        readObject(path);
    }

    private static void readObject(Path path) throws IOException, ClassNotFoundException {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(path.toFile()))) {
            Object object = objectInputStream.readObject();
            System.out.println(object);
        }
    }

    private static void writeObject(Path path) throws IOException {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(path.toFile()))) {
            Person sergey = new Person(26,"Sergey");
            objectOutputStream.writeObject(sergey);
        }
    }
}
