package com.mber.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/*
Хуан Хуанович
*/
public class Solution3 {
    public static final List<Person> PEOPLE = new ArrayList<>();

    public static void main(String[] args) {
        args = new String []{"src/com/mber/javarush/task/task19/task1921/file.txt"};

        String fileName = args[0];

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            SimpleDateFormat sdf = new SimpleDateFormat("dd MM yyyy", Locale.ENGLISH);
            while (reader.ready()) {
                String line = reader.readLine();
                String name = line.replaceAll("\\d", "").trim();
                String date = line.replace(name, "").trim();
                PEOPLE.add(new Person(name, sdf.parse(date)));
            }

        } catch (IOException | ParseException ignore) { /* NOP */}

    }
}


