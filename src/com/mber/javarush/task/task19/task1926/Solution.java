package com.mber.javarush.task.task19.task1926;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Перевертыши
*/

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader reader = new BufferedReader(new FileReader(file.readLine()))) {
            while (reader.ready()) System.out.println(new StringBuilder(reader.readLine()).reverse());
        } catch (IOException ignore) { /* NOP */}
    }
}
