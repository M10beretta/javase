package com.mber.javarush.task.task19.task1922;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
Ищем нужные строки

Считать с консоли имя файла.
Вывести в консоль все строки из файла, которые содержат всего 2 слова из списка words.
Закрыть потоки.
*/

public class Solution1 {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) {

        String file = null;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            file = reader.readLine();

        } catch (IOException ignore) { /* NOP */}

        try (BufferedReader in = new BufferedReader(new FileReader(file))) {
            while (in.ready()) {
                String read = in.readLine();
                String[] split = read.split(" ");

                int wordCount = 0;
                for (String s : split) {
                    if (words.contains(s)) {
                        wordCount++;
                    }
                }

                if (wordCount == 2)
                    System.out.println(read);
            }
        } catch (IOException ignore) {
            /* NOP */
        }
    }
}