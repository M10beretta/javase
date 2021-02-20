package com.mber.dmdev.level2.lesson22;

import java.io.*;
import java.nio.file.Path;

public class OutputRunner {
    public static void main(String[] args) throws IOException {
        File file = Path.of("src","com","mber","dmdev","level2","lesson22","output.txt").toFile();
/*
        try (FileOutputStream outputStream = new FileOutputStream(file, true)) {
            String value = "Hello Word!";
            outputStream.write(value.getBytes());
        }
*/
        try (BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(file, true))) {
            String value = "\nHello Word!";
            outputStream.write(value.getBytes());
            outputStream.write("\r\n".getBytes());
            outputStream.write(System.lineSeparator().getBytes());
        }

    }
}
