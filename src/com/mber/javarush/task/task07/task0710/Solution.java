package com.mber.javarush.task.task07.task0710;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
В начало списка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        extracted();
    }

    private static void extracted() throws IOException {
        ArrayList<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            list.add(0, reader.readLine());
        }

        for (String string: list) {
            System.out.println(string);
        }
    }

}