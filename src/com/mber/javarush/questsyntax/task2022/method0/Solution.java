package com.mber.javarush.questsyntax.task2022.method0;

import java.io.*;

/*
Переопределение сериализации в потоке
*/

public class Solution implements Serializable, AutoCloseable {
    public static void main(String[] args) {
        String file = "D:\\study\\programming\\practice\\src\\com.mber.javarush\\questsyntax\\task2022\\method0\\file.bin";
        String fileSer = "D:\\study\\programming\\practice\\src\\com.mber.javarush\\questsyntax\\task2022\\method0\\file.ser";
        try (FileOutputStream fileOutput = new FileOutputStream(fileSer);
             ObjectOutputStream outputStream = new ObjectOutputStream(fileOutput);
             FileInputStream fiStream = new FileInputStream(fileSer);
             ObjectInputStream objectStream = new ObjectInputStream(fiStream)
        ) {
            Solution solution = new Solution(file);
            solution.writeObject("some text");

            outputStream.writeObject(solution);
            outputStream.flush();

            //load object from file
            Solution loadedObject = (Solution) objectStream.readObject();

            loadedObject.writeObject("some text - 2");
        } catch (Exception skipped) {
        }
    }

    private transient FileOutputStream stream;
    private String fileName;

    public Solution(String fileName) throws FileNotFoundException {
        this.fileName = fileName;
        this.stream = new FileOutputStream(fileName);
    }

    public void writeObject(String string) throws IOException {
        stream.write(string.getBytes());
        stream.write("\n".getBytes());
        stream.flush();
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        this.stream = new FileOutputStream(fileName, true);
    }

    @Override
    public void close() throws Exception {
        System.out.println("Closing everything!");
        stream.close();
    }
}
