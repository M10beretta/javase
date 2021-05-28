package com.mber.javarush.task.task20.task2015;

import java.io.*;

/*
Переопределение сериализации
*/

public class Solution implements Serializable , Runnable{
    private transient Thread runner;
    private final int speed;

    public Solution(int speed) {
        this.speed = speed;
        runner = new Thread(this);
        runner.start();
    }

    public void run() {
        // do something here, doesn't matter what
        System.out.println("Hello! Speed: " + speed);
    }

    /**
     * Переопределяем сериализацию.
     * Для этого необходимо объявить методы:
     * private void writeObject(ObjectOutputStream out) throws IOException
     * private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException
     * Теперь сериализация/десериализация пойдет по нашему сценарию :)
     */
    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        runner = new Thread(this);
        runner.start();
    }

    public static void main(String[] args) {
        Solution savedObject = new Solution(10); System.out.println(savedObject.toString());

        String file = "D:\\Study\\programming\\practice\\src" +
                "\\com.mber.javarush\\counter\\task2015\\method0\\file.ser";

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file));
             ObjectInputStream in = new ObjectInputStream(new FileInputStream(file))) {
            out.writeObject(savedObject);
            Solution loadedObject = (Solution) in.readObject(); System.out.println(loadedObject.toString());

        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }
    }
}