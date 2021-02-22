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

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader data = new BufferedReader(new FileReader(reader.readLine()))) {
            while (data.ready())
                System.out.println(new StringBuilder(data.readLine()).reverse());

        } catch (IOException ignore) {
            /* NOP */
        }
    }
}
