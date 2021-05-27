package com.mber.javarush.task.task19.task1923;

import java.io.*;

/*
Слова с цифрами
*/

public class Solution2 {
    public static void main(String[] args) {
        args = new String[]{"src/com/mber/javarush/task/task19/task1923/file1.txt",
                "src/com/mber/javarush/task/task19/task1923/file2.txt"};

        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]));
             BufferedWriter writer = new BufferedWriter(new FileWriter(args[1]))) {
            while (reader.ready()) {
                String line = reader.readLine();
                String[] words = line.split("[^\\d\\w[А-я]]+");
                for (String word : words) {
                    if (!word.trim().matches("[\\D]+"))
                        writer.write(word + " ");
                }
            }
        } catch (IOException e) { /* NOP */}
    }
}
