package com.mber.javarush.task.analyz.task1925.method2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringJoiner;

public class Solution {
    public static void main(String[] args) {
        StringJoiner joiner = new StringJoiner(",");
        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]));
             FileWriter writer = new FileWriter(args[1])) {
            while (reader.ready()) {
                for (String item : reader.readLine().split(" "))
                    if (item.length() > 6) joiner.add(item);
            }
            writer.write(joiner.toString());

        } catch (IOException ignore) {
            /* NOP */
        }
    }
}
