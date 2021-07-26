package com.mber.javarush.task.task22.task2210;

/*
StringTokenizer
*/

import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) {
        getTokens("level22.lesson13.task01", ".");
    }

    public static String[] getTokens(String query, String delimiter) {
        StringTokenizer tokenizer = new StringTokenizer(query, delimiter);
        String[] result = new String[tokenizer.countTokens()];
        int i = 0;
        while (tokenizer.hasMoreTokens()) result[i++] = tokenizer.nextToken();
        return result;
    }
}