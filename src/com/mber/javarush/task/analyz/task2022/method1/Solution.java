package com.mber.javarush.task.analyz.task2022.method1;

import java.io.*;

/*
Переопределение сериализации в потоке
*/

public class Solution implements Serializable, AutoCloseable {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String file = "D:\\study\\programming\\practice\\src\\com.mber.javarush\\task\\task2022\\method0\\file.bin";
        Solution solutionSave = new Solution(file);
        System.out.println(solutionSave);
        solutionSave.writeObject("данные");
        solutionSave.writeObject("дополнительные данные");

        String fileSer = "D:\\study\\programming\\practice\\src\\com.mber.javarush\\task\\task2022\\method0\\file.ser";
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileSer));
             ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileSer))) {
            out.writeObject(solutionSave);
            Solution solutionLoad = (Solution) in.readObject();
            System.out.println(solutionLoad.toString());
        }

    }
    private transient FileOutputStream stream;

    String fileName;

    public Solution(String fileName) throws FileNotFoundException {
        this.stream = new FileOutputStream(fileName);
        this.fileName = fileName;
    }

    public void writeObject(String string) throws IOException {
        stream.write(string.getBytes());
        stream.write("\n".getBytes());
        stream.flush();
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
        out.flush();
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        stream = new FileOutputStream(fileName, true);
    }

    @Override
    public void close() throws Exception {
        System.out.println("Closing everything!");
        stream.close();
    }

    @Override
    public String toString() {
        return String.valueOf(stream);
    }

}