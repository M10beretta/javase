package javarush.questsyntax.task1710;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/*
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    static SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
    static SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);


    public static void main(String[] args) throws ParseException {
        if (args == null || args.length < 1) {
            throw new RuntimeException();
        }
        Date birthDayDate = new Date();
        Person person;
        switch (args[0]) {
            case "-c":
                birthDayDate = simpleDateFormat1.parse(args[3]);
                if (args[2].equals("м"))
                    person = Person.createMale(args[1], birthDayDate);
                else
                    person = Person.createFemale(args[1], birthDayDate);
                allPeople.add(person);
                         System.out.println(allPeople.size() - 1);
                break;
            case "-u":
                birthDayDate = simpleDateFormat1.parse(args[4]);
                int id = Integer.parseInt(args[1]);
                person = allPeople.get(id);
                if (person == null) {
                    throw new IllegalArgumentException();
                }
                person.setSex(getSex(args[3]));
                person.setBirthDate(birthDayDate);
                person.setName(args[2]);
                allPeople.set(id, person);
                break;
            case "-d":
                Person currentPerson = allPeople.get(Integer.parseInt(args[1]));
                currentPerson.setName(null);
                currentPerson.setSex(null);
                currentPerson.setBirthDate(null);
                break;
            case "-i":
                person = allPeople.get(Integer.parseInt(args[1]));
                if (person != null)
                    System.out.println(person.getName() + " "
                            + (person.getSex() == Sex.MALE ? "м" : "ж") + " "
                            + simpleDateFormat2.format(person.getBirthDate()));
                break;

        }
    }

    private static Sex getSex(String sexParam) {
        return sexParam.equals("м") ? Sex.MALE : Sex.FEMALE;
    }
}