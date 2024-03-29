package com.mber.javarush.task.task22.task2211;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Solution2 {
    public static void main(String[] args) throws IOException {
        args = new String[]{
                "src/com/mber/javarush/task/task22/task2211/file_windows-1251.txt",
                "src/com/mber/javarush/task/task22/task2211/file_UTF-8.txt"
        };
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(args[0]), "Windows-1251"));
             BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(args[1]), StandardCharsets.UTF_8))) {

            String s;
            while ((s = reader.readLine()) != null) {
                writer.write(s + "\n");
            }
        }
    }
}
