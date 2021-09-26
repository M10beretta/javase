package com.mber.topic.core.dmdev.level2.lesson22_OutputStream_Writer_Files.task;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

import static java.nio.file.StandardOpenOption.APPEND;

/**
 * 5. Задан файл с java-кодом. Прочитать текст программы из файла и
 * записать в другой файл в обратном порядке символы каждой
 * строки.
 */
public class Task5 {
    public static void main(String[] args) {
        Path path = Path.of("src", "com", "mber", "dmdev", "level2", "lesson22", "counter", "Task4.java");
        Path result = Path.of("src", "com", "mber", "dmdev", "level2", "lesson22", "counter", "edited", "task.txt");
        try (Stream<String> lines = Files.lines(path);
             BufferedWriter bufferedWriter = Files.newBufferedWriter(result, APPEND)) {
            lines.map(StringBuilder::new)
                    .map(StringBuilder::reverse)
                    .forEach(line -> {
                        try {
                            bufferedWriter.write(line.toString());
                            bufferedWriter.newLine();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    });

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
