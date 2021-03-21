package com.mber.dmdev.level2.lesson22;

import java.io.*;
import java.nio.file.Path;

public class OutputRunner {
    public static void main(String[] args) throws IOException {
        File file = Path.of("src","com","mber","dmdev","level2","lesson22","output.txt").toFile();
    }

    private static void extracted2(File file) throws IOException {
        try (FileOutputStream outputStream = new FileOutputStream(file, true)) {
            String value = "Hello Word!";
            outputStream.write(value.getBytes());
        }
    }

    private static void extracted1(File file) throws IOException {
        try (BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(file, true))) {
            String value = "\nHello Word!";
            outputStream.write(value.getBytes());
            outputStream.write("\r\n".getBytes());
            outputStream.write(System.lineSeparator().getBytes());
        }
    }
}
