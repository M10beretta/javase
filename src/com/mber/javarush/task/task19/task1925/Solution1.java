package com.mber.javarush.task.task19.task1925;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/*
Длинные слова
*/

public class Solution1 {
    public static void main(String[] args) {
        args = new String[]{"src/com/mber/javarush/task/task19/task1925/file1.txt",
                "src/com/mber/javarush/task/task19/task1925/file2.txt"};

        String fileName1 = args[0];
        String fileName2 = args[1];
        String input;

        ArrayList<String> fileContent = new ArrayList<>();

        try (BufferedReader fileReader = new BufferedReader(new FileReader(fileName1))) {
            while ((input = fileReader.readLine()) != null)
                fileContent.add(input);
        } catch (IOException ignore) { /* NOP */}

        StringBuilder sbLine = new StringBuilder();
        for (String line : fileContent) {
            String[] splitLine = line.split(" ");
            for (String word : splitLine) if (word.length() > 6) sbLine.append(word).append(" ");
        }

        String resultLine = sbLine.toString().trim().replaceAll(" ", ",");
        try (FileWriter fileWriter = new FileWriter(fileName2)) {
            fileWriter.write(resultLine);
        } catch (IOException ignore) { /* NOP */}
    }
}