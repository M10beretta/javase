package com.mber.topic.structure.metanit._2_use_for_saving_data_jointly_with_switch;

public class Main {
    public static void main(String[] args) {

        Book book = new Book("War and Peace", "L. Tolstoy", Type.BELLES_LETTRES);
        System.out.printf("Book '%s' has a type %s", book.name, book.bookType);

        switch (book.bookType) {
            case BELLES_LETTRES -> System.out.println("Belles-Lettres");
            case SCIENCE -> System.out.println("Science");
            case SCIENCE_FICTION -> System.out.println("Science fiction");
            case PHANTASY -> System.out.println("Phantasy");
        }
    }
}

class Book {
    String name;
    Type bookType;
    String author;

    Book(String name, String author, Type type) {

        bookType = type;
        this.name = name;
        this.author = author;
    }
}

enum Type {
    SCIENCE,
    BELLES_LETTRES,
    PHANTASY,
    SCIENCE_FICTION
}
