package com.mber.javarush.task.task1921.method1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]))) {
            String line;
            while ((line = reader.readLine()) != null) {
                Matcher matcher = Pattern.compile("([А-Яа-я -]+)|(\\d+) (\\d+) (\\d+)").matcher(line);
                matcher.find();
                String name = matcher.group(1).trim();
                matcher.find();
                int day = Integer.parseInt(matcher.group(2));
                int month = Integer.parseInt(matcher.group(3));
                int year = Integer.parseInt(matcher.group(4));
                Calendar calendar = new GregorianCalendar(year, month - 1, day);
                PEOPLE.add(new Person(name, calendar.getTime()));
            }
        } catch (IOException e) {
            /*NOP*/
        }
    }
}

