package com.mber.javarush.task.task18.task1825;

import java.io.*;
import java.util.Set;
import java.util.TreeSet;

/*
Собираем файл
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Set<String> files = new TreeSet<>((o1, o2) -> {
            String[] partsFirst = o1.split(".part");
            String[] partsSecond = o2.split(".part");
            int numberFirst = Integer.parseInt(partsFirst[partsFirst.length - 1]);
            int numberSecond = Integer.parseInt(partsSecond[partsSecond.length - 1]);
            return numberFirst - numberSecond;
        });

        String outputFile = null;
        String readString;
        while (!(readString = reader.readLine()).equals("end")) {
            files.add(readString);
            if (outputFile == null) {
                int indexOfSuffix = readString.lastIndexOf(".part");
                outputFile = readString.substring(0, indexOfSuffix);
            }
        }
        if (outputFile == null) return;


        try (FileOutputStream fileOutputStream = new FileOutputStream(outputFile)) {
            for (String file : files) {
                try (FileInputStream fileInputStream = new FileInputStream(file)) {
                    byte[] buffer = new byte[fileInputStream.available()];
                    while (fileInputStream.available() > 0) {
                        int bytesRead = fileInputStream.read(buffer);
                        fileOutputStream.write(buffer, 0, bytesRead);
                    }
                }
            }
        }
    }
}