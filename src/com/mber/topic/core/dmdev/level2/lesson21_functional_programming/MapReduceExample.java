package com.mber.topic.core.dmdev.level2.lesson21_functional_programming;

import java.util.Optional;
import java.util.stream.Stream;

public class MapReduceExample {
    public static void main(String[] args) {

        Stream<Student> studentStream = Stream.of(
                new Student(18, "Ivan"),
                new Student(23, "Petr"),
                new Student(34, "Vasya"),
                new Student(45, "Sveta"),
                new Student(20, "Katya"),
                new Student(68, "Den"),
                new Student(101, "Kira"));

    }

    private static void printMaxAge(Stream<Student> studentStream) {
        studentStream
                .map(Student::getAge)
                .reduce(Math::max)
                .ifPresent(System.out::println);
    }

    private static void printSumAge(Stream<Student> studentStream) {
        studentStream
                .sequential()
                .map(Student::getAge)
                .reduce(Integer::sum)
                .ifPresent(System.out::println);
    }

    private static void printMaybeStudentEmpty(Stream<Student> studentStream) {
        Optional<Student> maybeStudent = studentStream
                .sequential()
                .filter(student -> student.getAge() < 18)
                .reduce((student1, student2)
                        -> student1.getAge() > student2.getAge() ? student1 : student2);
        System.out.println(maybeStudent);
    }
}
