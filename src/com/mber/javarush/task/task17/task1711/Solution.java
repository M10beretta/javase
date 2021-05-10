package com.mber.javarush.task.task17.task1711;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/*
CRUD 2
*/

public class Solution {
    public static final List<Person> allPeople = new ArrayList<>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    private static final SimpleDateFormat inputFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
    private static final SimpleDateFormat outputFormat = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);

    public static void main(String[] args) {
//        args = new String[] {"-c", "Василий", "м", "15/04/1990", "Алена", "ж", "08/05/1996"};
//        args = new String[]{"-u", "0", "Александр", "м", "21/07/1987", "1", "Елена", "ж", "08/09/1993"};
//        args = new String[]{"-d", "0", "1"};
//        args = new String[]{"-i", "0", "1"};

        try {
            switch (args[0]) {
                case "-c":
                    synchronized (allPeople) {
                        for (int i = 1; i < args.length; i += 3) {
                            String name = args[i];
                            String sex = args[i + 1];
                            Date date = inputFormat.parse(args[i + 2]);
                            Person person = sex.equals("м") ? Person.createMale(name, date) :
                                    Person.createFemale(name, date);
                            allPeople.add(person);
                            System.out.println(allPeople.indexOf(person));
                        }
                    }
                    break;
                case "-u":
                    synchronized (allPeople) {
                        for (int i = 1; i < args.length; i += 4) {
                            int id = Integer.parseInt(args[i]);
                            String name = args[i + 1];
                            String sex = args[i + 2];
                            Date date = inputFormat.parse(args[i + 3]);
                            allPeople.get(id).setName(name);
                            allPeople.get(id).setSex("м".equals(sex) ? Sex.MALE : Sex.FEMALE);
                            allPeople.get(id).setBirthDate(date);
                        }
                    }
                    break;
                case "-d":
                    synchronized (allPeople) {
                        for (int i = 1; i < args.length; i++) {
                            allPeople.get(Integer.parseInt(args[i])).setName(null);
                            allPeople.get(Integer.parseInt(args[i])).setSex(null);
                            allPeople.get(Integer.parseInt(args[i])).setBirthDate(null);
                        }
                    }
                    break;
                case "-i":
                    synchronized (allPeople) {
                        for (int i = 1; i < args.length; i++) {
                            String arg = args[i];
                            int id = Integer.parseInt(arg);
                            Person person = allPeople.get(id);
                            System.out.print(person.getName() + " ");
                            System.out.print(person.getSex().equals(Sex.MALE) ? "м " : "ж ");
                            System.out.println(outputFormat.format(person.getBirthDate()));
                        }
                    }
                    break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}