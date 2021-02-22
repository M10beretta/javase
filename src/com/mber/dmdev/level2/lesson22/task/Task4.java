package com.mber.dmdev.level2.lesson22.task;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * 4. Задан файл с java-кодом. Прочитать текст программы из файла и
 * все слова public в объявлении атрибутов и методов класса заменить
 * на слово private. Результат сохранить в другой заранее созданный
 * файл.
 */
public class Task4 {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("src", "com", "mber", "dmdev", "level2", "lesson22", "counter", "Task3.java");

        String stringValue = Files.readString(path);
        String result = stringValue.replace("public", "private");

        Path directoryPath = Path.of("src", "com", "mber", "dmdev", "level2", "lesson22", "counter", "edited");
        Path resultPath = Path.of("src", "com", "mber", "dmdev", "level2", "lesson22", "counter", "edited", "Task.txt");
        Files.createDirectories(directoryPath);
        Files.writeString(resultPath, result);
    }
}
