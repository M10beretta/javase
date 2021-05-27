package com.mber.javarush.task.task19.task1925;

import java.io.*;
import java.util.ArrayList;

/*
Длинные слова
*/

public class Solution2 {
    public static void main(String[] args) {
        args = new String[]{"src/com/mber/javarush/task/task19/task1925/file1.txt",
                "src/com/mber/javarush/task/task19/task1925/file2.txt"};

        ArrayList<String> list = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]));
             BufferedWriter writer = new BufferedWriter(new FileWriter(args[1]))) {
            while (reader.ready()) {
                String str = reader.readLine();
                String[] words = str.split(" ");
                for (String s : words) if (s.length() > 6) list.add(s); }
            String string = list.toString();
            writer.write(string.replaceAll("[\\[ \\]]", ""));

        } catch (IOException ignore) {
            /* NOP */
        }
    }
}
