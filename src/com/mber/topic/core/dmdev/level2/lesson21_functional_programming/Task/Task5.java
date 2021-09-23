package com.mber.topic.core.dmdev.level2.lesson21_functional_programming.Task;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import static java.util.stream.Collectors.*;

/**
 * 5. Дан класс Person с полями firstName, lastName, age.
 * Вывести полное имя самого старшего человека,
 * у которого длина этого имени не превышает 15 символов.
 */
public class Task5 {
    public static void main(String[] args) {
        List<Person> persons = List.of(
                new Person("Ivan", "Ivanov", 20),
                new Person("Petr", "Petrov", 25),
                new Person("Sveta", "Svetikova", 33),
                new Person("Kate", "Ivanova", 25),
                new Person("Slava", "Slavikov", 18),
                new Person("Arni", "Kutuzov12324", 56)
        );

    }

    private static void extracted4(List<Person> persons) {
        Map<Integer, Person> map = persons.stream()
                .collect(toMap(Person::getAge, Function.identity()));
        System.out.println(map);
    }

    private static void extracted3(List<Person> persons) {
        Map<Integer, List<String>> collect = persons.stream()
                .collect(groupingBy(Person::getAge,
                        mapping(Person::getFullName, toList())));
        System.out.println(collect);
    }

    private static void extracted2(List<Person> persons) {
        Map<Integer, List<Person>> collect = persons.stream()
                .collect(groupingBy(Person::getAge));
        System.out.println(collect);
    }

    private static void extracted1(List<Person> persons) {
        persons.stream()
                .filter(person -> person.getFullName().length() < 15)
                .max(Comparator.comparing(Person::getAge))
                .map(Person::getFullName)
                .ifPresent(System.out::println);
    }
}
