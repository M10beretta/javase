package com.mber.javarush.task.analyz.task1817;

import java.io.FileReader;
import java.io.IOException;

/*
Английские буквы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        if (args.length == 0) return;
        int spaces = 0;
        int total = 0;
        try (FileReader fileReader = new FileReader(args[0])) {
            while (fileReader.ready()) {
                int i = fileReader.read();
                total++;
                if ((i == 32)) spaces++;
            }
        }
        System.out.println(spaces);
        System.out.println(total);
        System.out.println((double) spaces / total * 100);
        System.out.printf("%.2f%s", (double) spaces / total * 100, "\n");
    }
}
