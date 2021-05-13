package com.mber.javarush.task.task19.task1904;

import java.io.IOException;
import java.util.*;

/*
И еще один адаптер
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class PersonScannerAdapter implements PersonScanner {
        private final Scanner fileScanner;

        public PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }

        @Override
        public Person read() throws IOException {
            String line = fileScanner.nextLine();
            String[] strings = line.split(" ", 4);
            String lastName = strings[0].trim();
            String firstName = strings[1].trim();
            String middleName = strings[2].trim();

            String[] dateStr = strings[3].split(" ", 3);
            int year = Integer.parseInt(dateStr[2].trim());
            int month = Integer.parseInt(dateStr[1].trim());
            int day = Integer.parseInt(dateStr[0].trim());
            Date birthDate = new Date(year - 1900, month - 1, day);

            return new Person(firstName, middleName, lastName, birthDate);
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}
