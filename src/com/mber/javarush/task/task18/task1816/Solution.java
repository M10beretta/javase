package com.mber.javarush.task.task18.task1816;

import java.io.FileReader;
import java.io.IOException;

/*
Английские буквы
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        if (args.length == 0) return;

        int count=0;
        try (FileReader fileReader = new FileReader(args[0])) {
            while (fileReader.ready()) {
                int sym = fileReader.read();
                if ((sym >= 65 && sym <= 90) || (sym >= 97 && sym <= 122)) count++;
            }
        }
        System.out.println(count);
    }
}
