package com.mber.javarush.task.task20.task2022;

import java.io.*;

/*
Переопределение сериализации в потоке
*/

public class Solution implements Serializable, AutoCloseable {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String file1 = "src/com/mber/javarush/task/task20/task2022/file1.bin";
        String file2 = "src/com/mber/javarush/task/task20/task2022/file2.bin";

        var solutionSave = new Solution(file2);

        solutionSave.writeObject("данные1");
        solutionSave.writeObject("данные2");

        try (var out = new ObjectOutputStream(new FileOutputStream(file1));
             var in = new ObjectInputStream(new FileInputStream(file1))) {
            out.writeObject(solutionSave);
            var solutionLoad = (Solution) in.readObject();
            solutionLoad.writeObject("данные3");
        }
    }

    @Serial
    private static final long serialVersionUID = 527507527464422134L;
    private transient FileOutputStream stream;
    String file;

    public Solution(String file) throws FileNotFoundException {
        this.stream = new FileOutputStream(file);
        this.file = file;
    }

    public void writeObject(String string) throws IOException {
        stream.write((string + "\n").getBytes());
        stream.flush();
    }

    @Serial
    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
        out.flush();
    }

    @Serial
    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        stream = new FileOutputStream(file, true);
    }

    @Override
    public void close() throws Exception {
        System.out.println("Closing everything!");
        stream.close();
    }
}