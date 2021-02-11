package com.mber.javarush.task.analyz.task1910;

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        String fileName1;
        String fileName2;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            fileName1 = reader.readLine();
            fileName2 = reader.readLine();
        }
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName1));
             BufferedWriter writer = new BufferedWriter(new FileWriter(fileName2))) {

            while (reader.ready()) writer.write(reader.readLine().replaceAll("\\p{P}|\\n", ""));
        }

    }
}

