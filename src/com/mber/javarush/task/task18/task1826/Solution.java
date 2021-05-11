package com.mber.javarush.task.task18.task1826;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
Шифровка
*/

public class Solution {
    public static void main(String[] args) throws IOException {
//        args = new String[]{"-e", "src/com/mber/javarush/task/task18/task1826/file.txt"
//                ,"src/com/mber/javarush/task/task18/task1826/encrypt.txt"};
//        args = new String[]{"-d", "src/com/mber/javarush/task/task18/task1826/encrypt.txt"
//                , "src/com/mber/javarush/task/task18/task1826/decrypt.txt"};

        String mode = args[0];
        if (!(mode.equals("-e") || mode.equals("-d"))) {
            System.out.println("Unexpected value: " + args[0]);
            return;
        }
        try (FileInputStream fileInputStream = new FileInputStream(args[1]);
             FileOutputStream fileOutputStream = new FileOutputStream(args[2])) {

            switch (args[0]) {
                case "-e":
                    while (fileInputStream.available() > 0) {
                        fileOutputStream.write(fileInputStream.read() + 33);
                    }
                    break;
                case "-d":
                    while (fileInputStream.available() > 0) fileOutputStream.write(fileInputStream.read() - 33);
                    break;
            }
        }
    }
}