package com.mber.javarush.task.task20.task2003;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/*
Знакомство с properties
*/

public class Solution2 {

    public static Map<String, String> runtimeStorage = new HashMap<>();

    public static void save(OutputStream outputStream) throws Exception {
        var properties = new Properties();
        properties.putAll(runtimeStorage);
        properties.store(outputStream, "my comments");
    }

    public static void load(InputStream inputStream) throws IOException {
        var properties = new Properties();
        properties.load(inputStream);
        properties.forEach((k, v) -> runtimeStorage.put((String) k, (String) v));
    }

    public static void main(String[] args) {
        try (var reader = new BufferedReader(new InputStreamReader(System.in));
             var stream = new FileInputStream(reader.readLine())) {
            load(stream);
            Solution2.save(new FileOutputStream(reader.readLine()));
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(runtimeStorage);
    }
}
