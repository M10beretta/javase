package com.mber.javarush.task.task20.task2019;

/*
Исправить ошибку. Сериализация
*/

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Solution implements Serializable {
    @Serial
    private static final long serialVersionUID = -6518289803123435337L;

    public static void main(String[] args) throws Exception {
        String file = "src/com/mber/javarush/task/task20/task2019/file.bin";

        var fileOutput = new FileOutputStream(file);
        var outputStream = new ObjectOutputStream(fileOutput);

        var solution = new Solution();
        outputStream.writeObject(solution);

        fileOutput.close();
        outputStream.close();

        //load
        var fiStream = new FileInputStream(file);
        var objectStream = new ObjectInputStream(fiStream);

        var loadedObject = (Solution) objectStream.readObject();

        fiStream.close();
        objectStream.close();

        //Attention!!
        System.out.println(loadedObject.size());
    }

    private final Map<String, String> m = new HashMap<>();

    public Map<String, String> getMap() {
        return m;
    }

    public Solution() {
        m.put("Mickey", "Mouse");
    }
    public int size() {
        return m.size();
    }
}