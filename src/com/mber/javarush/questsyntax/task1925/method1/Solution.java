package com.mber.javarush.questsyntax.task1925.method1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]));
             FileWriter writer = new FileWriter(args[1])) {
            while (reader.ready()) {
                String str = reader.readLine();
                String[] words = str.split(" ");
                for (String s : words) {
                    if (s.length() > 6) list.add(s);
                    System.out.println(s.length());
                }
            }
            String string = list.toString();
            writer.write(string.replaceAll("[\\[ \\]]", ""));

        } catch (IOException ignore) {
            /* NOP */
        }
    }
}
