package javarush.questsyntax.task1822;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try (BufferedReader bufFileReader = new BufferedReader(new FileReader(reader.readLine()))) {
            while (bufFileReader.ready()) {
                String line = bufFileReader.readLine();
                String[] split = line.split(" ", -1);
                if (args[0].trim().equals(split[0].trim())) {
                    System.out.println(line);
                    break;
                }
            }
        }
    }
}
