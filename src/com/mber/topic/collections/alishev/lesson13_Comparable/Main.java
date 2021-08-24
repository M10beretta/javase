package com.mber.topic.collections.alishev.lesson13_Comparable;

import java.util.*;

// интерфес Comparable

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> people = new LinkedHashMap<>();
        people.put(2, "Katy");
        people.put(1, "Leonard");
        people.put(4, "Tom");
        people.put(3, "Mike");
        people.put(5, "Edward");
        people.put(6, "Hank");

        System.out.println("LinkedHashMap: " + people);

        Set<PersonSortId> personSortIdSet = new TreeSet<>();
        Set<PersonSortNameLength> personSortNameLengthSet = new TreeSet<>();

        List<PersonSortId> personSortIdList = new ArrayList<>();
        List<PersonSortNameLength> personSortNameLengthList = new ArrayList<>();


        for (Map.Entry<Integer, String> entry : people.entrySet()) {
            personSortIdSet.add(new PersonSortId(entry.getKey(), entry.getValue()));
            // при заполнении TreeSet пропадают элементы, нужно корректровать компаратор
            personSortNameLengthSet.add(new PersonSortNameLength(entry.getKey(), entry.getValue()));
            personSortIdList.add(new PersonSortId(entry.getKey(), entry.getValue()));
            personSortNameLengthList.add(new PersonSortNameLength(entry.getKey(), entry.getValue()));
        }

        System.out.println("TreeSet Id: " + personSortIdSet);
        System.out.println("TreeSet len: " + personSortNameLengthSet);

        printList(personSortIdList, personSortNameLengthList);

        Collections.sort(personSortIdList);
        Collections.sort(personSortNameLengthList);

        printList(personSortIdList, personSortNameLengthList);

    }

    private static void printList(List<PersonSortId> personSortIdList, List<PersonSortNameLength> personSortNameLengthList) {
        System.out.println("ArrayList id: " + personSortIdList);
        System.out.println("ArrayList len: " + personSortNameLengthList);
    }
}

// зададим сортировку по умолчанию по id, естетственные порядок

class PersonSortId implements Comparable<PersonSortId> {
    private final int id;
    private final String name;

    public PersonSortId(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(PersonSortId o) {
        return Integer.compare(id, o.id);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonSortId person = (PersonSortId) o;
        return id == person.id && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return id + " " + name;
    }
}

// зададим сортировку по умолчанию по длине имени, естетственные порядок

class PersonSortNameLength implements Comparable<PersonSortNameLength> {
    private final int id;
    private final String name;

    public PersonSortNameLength(int id, String name) {
        this.id = id;
        this.name = name;
    }
    // добавлено дополнительное условие, т.к. ThreeSet удаляет одинаковые элементы
    @Override
    public int compareTo(PersonSortNameLength o) {
        int result = Integer.compare(name.length(), o.name.length());
        if (result == 0) return name.compareTo(o.name);
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonSortNameLength that = (PersonSortNameLength) o;
        return id == that.id && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return id + " " + name;
    }
}
