package com.mber.javarush.task.task22.task2211;

/*
Смена кодировки
*/

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class Solution1 {
    public static void main(String[] args) throws IOException {
        args = new String[]{
                "src/com/mber/javarush/task/task22/task2211/file_windows-1251.txt",
                "src/com/mber/javarush/task/task22/task2211/file_UTF-8.txt"
        };
        byte[] data = Files.readAllBytes(Path.of(args[0]));
        String dataToWin = new String(data, Charset.forName("windows-1251"));
        String winToUtf = new String(dataToWin.getBytes(StandardCharsets.UTF_8));
        Files.writeString(Path.of(args[1]), winToUtf);
    }
}