package com.mber.javarush.task.task19.task1925;

import java.io.*;
import java.util.StringJoiner;

/*
Длинные слова
*/

public class Solution3 {
    public static void main(String[] args) {
        args = new String[]{"src/com/mber/javarush/task/task19/task1925/file1.txt",
                "src/com/mber/javarush/task/task19/task1925/file2.txt"};

        StringJoiner joiner = new StringJoiner(",");
        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]));
             BufferedWriter writer = new BufferedWriter(new FileWriter(args[1]))) {
            while (reader.ready()) {
                for (String item : reader.readLine().split(" ")) if (item.length() > 6) joiner.add(item);
            }
            writer.write(joiner.toString());

        } catch (IOException ignore) { /* NOP */}
    }
}
