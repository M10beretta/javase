package com.mber.javarush.task.task19.task1908;

import java.io.*;

/*
Выделяем числа
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String fileName1;
        String fileName2;

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            fileName1 = reader.readLine();
            fileName2 = reader.readLine();
        }
        StringBuilder builder = new StringBuilder();
        try (BufferedReader bufferedFileReader = new BufferedReader(new FileReader(fileName1))) {
            while (bufferedFileReader.ready()) builder.append((char) bufferedFileReader.read());
        }

        String replace = builder.toString().replaceAll("[А-Яа-яA-Za-z]+\\d*|\\d+[А-Яа-яA-Za-z]", " ").replaceAll("\\s+", " ");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName2))) {
            writer.write(replace);
        }

    }
}

