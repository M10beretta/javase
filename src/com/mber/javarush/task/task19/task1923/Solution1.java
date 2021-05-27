package com.mber.javarush.task.task19.task1923;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Слова с цифрами
*/

public class Solution1 {
    public static void main(String[] args) throws IOException {
        args = new String[]{"src/com/mber/javarush/task/task19/task1923/file1.txt",
                "src/com/mber/javarush/task/task19/task1923/file2.txt"};

        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]));
             BufferedWriter writer = new BufferedWriter(new FileWriter(args[1]))) {

            StringBuilder data = new StringBuilder();
            StringBuilder result = new StringBuilder();

            while (reader.ready()) data.append(reader.readLine());
            Matcher matcher = Pattern.compile("[А-я\\w]*\\d+[А-я\\w]*").matcher(data.toString());

            while (matcher.find())
                result.append(matcher.group()).append(" ");

            writer.write(result.toString().trim());

        } catch (IOException ignore) { /* NOP */
        }
    }
}