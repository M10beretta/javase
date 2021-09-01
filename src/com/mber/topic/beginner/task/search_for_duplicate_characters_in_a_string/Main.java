package com.mber.topic.beginner.task.search_for_duplicate_characters_in_a_string;

import java.util.Scanner;

// Ввести строку.
// Вывести максимальное число повторяющихся символов в подстроке.
// Вывести символ из этой же подстроки

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String line = scanner.next();
            if (line.equals("q")) return;
            char[] chars = line.toCharArray();
            maxCountRepeatAndCharInSubstring(chars);
        }
    }

    private static void maxCountRepeatAndCharInSubstring(char[] chars) {
        int countMax = 0, countRepeat = 0;
        char maxCountChar = chars[0];
        for (int i = 1; i < chars.length; i++) {
            if (chars[i - 1] == chars[i]) {
                if (++countRepeat > countMax) {
                    countMax = countRepeat;
                    maxCountChar = chars[i];
                }
            } else countRepeat = 0;
        }
        System.out.println((countMax + 1) + " " + maxCountChar);
    }
}
