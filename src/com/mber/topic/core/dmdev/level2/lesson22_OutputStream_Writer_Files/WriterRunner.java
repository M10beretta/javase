package com.mber.topic.core.dmdev.level2.lesson22_OutputStream_Writer_Files;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class WriterRunner {
    public static void main(String[] args) throws IOException {
    }

    private static void extracted3() throws IOException {
        Path path = Path.of("src","com","mber","dmdev","level2","lesson22","writer.txt");
        Files.write(path, List.of("Hello World", "Java"), StandardOpenOption.APPEND);
    }

    private static void extracted2() throws IOException {
        Path path = Path.of("src","com","mber","dmdev","level2","lesson22","writer.txt");
        try (BufferedWriter fileWriter = Files.newBufferedWriter(path)) {
            fileWriter.append("Hello World");
            fileWriter.newLine();
            fileWriter.append("Java");
        }
    }

    private static void extracted1() throws IOException {
        File file = Path.of("src","com","mber","dmdev","level2","lesson22","writer.txt").toFile();
        try (BufferedWriter fileWriter = new BufferedWriter(new FileWriter(file, true))) {
            fileWriter.append("Hello World");
            fileWriter.newLine();
            fileWriter.append("Java");
        }
    }
}
