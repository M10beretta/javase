package com.mber.javarush.task.task18.task1806;

/*
Исправить ошибки
*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        try (FileInputStream inputStream = new FileInputStream("src/com/mber/javarush/task/task18/topic.txt");
             FileOutputStream outputStream
                     = new FileOutputStream("src/com/mber/javarush/task/task18/task1806/result.txt")) {
            if (inputStream.available() > 0) {
                byte[] buffer = new byte[inputStream.available()];
                int count = inputStream.read(buffer);
                outputStream.write(buffer, 0, count);
            }
        }
    }
}