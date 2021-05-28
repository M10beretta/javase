package com.mber.javarush.task.task20.task2008;

import java.io.*;

/*
Как сериализовать singleton?
*/

public class Solution implements Serializable {
    @Serial
    private static final long serialVersionUID = -8006289410280033066L;

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Singleton instance = Singleton.getInstance();

        ByteArrayOutputStream byteArrayOutputStream = serializeSingletonInstance(instance);

        Singleton singleton1 = deserializeSingletonInstance(byteArrayOutputStream);
        Singleton singleton2 = deserializeSingletonInstance(byteArrayOutputStream);

        System.out.println("Проверка ourInstance : " + Singleton.getInstance());
        System.out.println("Проверка ourInstance : " + Singleton.getInstance());
        System.out.println("=========================================================");
        System.out.println("Проверка singleton1 : " + singleton1);
        System.out.println("Проверка singleton2 : " + singleton2);
    }

    public static ByteArrayOutputStream serializeSingletonInstance(Singleton instance) throws IOException {
        var byteArrayOutputStream = new ByteArrayOutputStream();
        var outputStream = new ObjectOutputStream(byteArrayOutputStream);
        outputStream.writeObject(instance);
        outputStream.close();
        return byteArrayOutputStream;
    }

    public static Singleton deserializeSingletonInstance(ByteArrayOutputStream byteArrayOutputStream) throws IOException, ClassNotFoundException {
        var byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        var inputStream = new ObjectInputStream(byteArrayInputStream);
        var singleton = (Singleton) inputStream.readObject();
        inputStream.close();
        return singleton;
    }

    public static class Singleton implements Serializable {
        @Serial
        private static final long serialVersionUID = 8234857862829081540L;
        private static Singleton ourInstance;
        public static Singleton getInstance() {
            if (ourInstance == null) ourInstance = new Singleton();
            return ourInstance;
        }
        private Singleton() {
        }

        @Serial
        private Object readResolve() throws ObjectStreamException{
            return getInstance();
        }
    }
}