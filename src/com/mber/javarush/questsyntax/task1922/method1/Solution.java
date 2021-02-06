package com.mber.javarush.questsyntax.task1922.method1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();

        try (BufferedReader readerF = new BufferedReader(new FileReader(fileName))) {
            while (readerF.ready()) {
                String line = readerF.readLine();
                String[] words = line.split(" ");
                int count = 0;
                for (String word : words) {
                    if (Solution.words.contains(word)) count++;
                }
                if (count == 2) System.out.println(line);

            }
        }

    }
}