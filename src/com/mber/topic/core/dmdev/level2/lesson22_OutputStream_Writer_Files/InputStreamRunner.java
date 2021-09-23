package com.mber.topic.core.dmdev.level2.lesson22_OutputStream_Writer_Files;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Path;

public class InputStreamRunner {
    public static void main(String[] args) throws IOException {

/*
        File file = new File("src/com/mber/dmdev/level2/lesson22/poesy.txt");
        File file = new File(String.join(File.separator, "src","com","mber","dmdev","level2","lesson22", "poesy.txt"));
        File file = Path.of("src", "com", "mber", "dmdev", "level2", "lesson22", "poesy.txt").toFile();
*/
        File file = Path.of("src/com/mber/dmdev/level2/lesson22/poesy.txt").toFile();


/*
        try (FileInputStream inputStream = new FileInputStream(file)) {
            byte[] bytes = inputStream.readAllBytes();
            String stringValue = new String(bytes);
            System.out.println(stringValue);
        }
*/

        // если необходимо считывать порционно
        try (FileInputStream inputStream = new FileInputStream(file)) {
            byte[] bytes = new byte[inputStream.available()];
            int counter = 0;
            byte currentByte;

            while ((currentByte = (byte) inputStream.read()) != -1) {
                bytes[counter++] = currentByte;
            }
            String stringValue = new String(bytes);
            System.out.println(stringValue);
        }
    }
}
