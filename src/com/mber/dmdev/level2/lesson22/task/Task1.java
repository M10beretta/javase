package com.mber.dmdev.level2.lesson22.task;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

/**
 * 1. Задан файл с текстом, найти и вывести в консоль все слова,
 * начинающиеся с гласной буквы.
 */
public class Task1 {

    private static final String VOWELS = "АЕЁИОУЫЭЮЯаеёиоуыэюя";

    public static void main(String[] args) throws IOException {
        Path path = Path.of("src", "com", "mber", "dmdev", "level2", "lesson22", "poesy.txt");
        try (Scanner scanner = new Scanner(path)) {
            while (scanner.hasNext()) {
                String word = scanner.next();
                char firstSymbol = word.charAt(0);
                if (VOWELS.indexOf(firstSymbol) != -1) {
                    System.out.println(word.replaceAll("[.,]", ""));
                }
            }
        }
    }
}
