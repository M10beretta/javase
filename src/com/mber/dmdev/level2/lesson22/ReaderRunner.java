package com.mber.dmdev.level2.lesson22;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReaderRunner {
    public static void main(String[] args) {

    }

    private static void extracted3() throws IOException {
        Path path = Path.of("src","com","mber","dmdev","level2","lesson22","poesy.txt");
        try (Stream<String> lines = Files.lines(path)) {
            lines.forEach(System.out::println);
        }
    }

    private static void extracted2() throws IOException {
        File file = Path.of("src","com","mber","dmdev","level2","lesson22","poesy.txt").toFile();
        try (BufferedReader fileReader = new BufferedReader(new FileReader(file))) {
            String collect = fileReader.lines()
                    .collect(Collectors.joining("\n"));
            System.out.println(collect);
        }
    }

    private static void extracted1() throws IOException {
        Path path = Path.of("src","com","mber","dmdev","level2","lesson22","poesy.txt");
        Files.readAllLines(path).forEach(System.out::println);
    }
}
