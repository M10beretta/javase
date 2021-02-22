package com.mber.javarush.task.task18.task1826.method1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
Шифровка
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String mode = args[0];
        if (!(mode.equals("-e") || mode.equals("-d"))) return;
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