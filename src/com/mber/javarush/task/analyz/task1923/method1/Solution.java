package com.mber.javarush.task.analyz.task1923.method1;

import java.io.*;
/*
Слова с цифрами
*/

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]));
             BufferedWriter writer = new BufferedWriter(new FileWriter(args[1]));) {
            while (reader.ready()) {
                String line = reader.readLine();
                String[] words = line.split(" ");
                for (String word : words) {
                    if (!word.trim().matches("[\\D]+"))
                        writer.write(word + " ");
                }
            }
        } catch (IOException e) {
            /* NOP */
        }
    }
}
