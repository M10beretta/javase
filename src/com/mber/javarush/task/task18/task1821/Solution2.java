package com.mber.javarush.task.task18.task1821;

import java.io.FileReader;
import java.io.IOException;

/*
Встречаемость символов
*/

public class Solution2 {
    public static void main(String[] args) throws IOException {
//        args = new String[]{"src/com/mber/javarush/task/task18/task1821/file.txt"};
        int[] aSCII = new int[128];
        try (FileReader reader = new FileReader(args[0])) {
            while (reader.ready()) {
                aSCII[reader.read()]++;
            }
        }
        for (int i = 32; i < aSCII.length; i++) {
            if (aSCII[i] != 0) {
                System.out.println((char) i + " " + aSCII[i]);
            }
        }
    }
}