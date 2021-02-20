package com.mber.dmdev.level2.lesson21;

import java.util.Optional;
import java.util.stream.Stream;

public class MapReduceExample {
    public static void main(String[] args) {
        Optional<Student> maybeStudent = Stream.of(
                new Student(18, "Ivan"),
                new Student(23, "Petr"),
                new Student(34, "Vasya"),
                new Student(45, "Sveta"),
                new Student(20, "Katya"),
                new Student(68, "Den"),
                new Student(101, "Kira")
        )
                .sequential()
//                .flatMap(student -> student.getMarks().stream())
                .filter(student -> student.getAge() < 18)
                .reduce(((student1, student2) -> student1.getAge() > student2.getAge()
                        ? student1 : student2));

        maybeStudent.ifPresent(System.out::println);
        maybeStudent.map(Student::getAge)
                .filter(age -> age > 25)
                .flatMap(age -> Optional.of(age * 2));



    }
}
