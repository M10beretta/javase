package com.mber.javarush.task.task15.task1504;

import java.util.LinkedList;
import java.util.List;

public class Solution2 {
    public static void main(String[] args) {
        List<Book> books = new LinkedList<Book>();
        books.add(new AgathaChristieBook("Hercule Poirot"));
        books.add(new MarkTwainBook("Tom Sawyer"));
        System.out.println(books);
    }

    abstract static class Book {

        public Book(String title) {
        }

        public abstract Book getBook();

        public abstract String getAuthor();

        public abstract String getTitle();

        private String getOutputByBookType() {
            String agathaChristieOutput = getAuthor() + ": " + getBook().getTitle() + " is a detective";
            String markTwainOutput = getBook().getTitle() + " was written by " + getAuthor();

            String output = "output";
            if (getBook() instanceof AgathaChristieBook) output = agathaChristieOutput;
            if (getBook() instanceof MarkTwainBook) output = markTwainOutput;
            return output;
        }

        public String toString() {
            return getOutputByBookType();
        }
    }

    public static class AgathaChristieBook extends Book {
        private final String title;

        public AgathaChristieBook(String title) {
            super(title);
            this.title = title;
        }

        @Override
        public Book getBook() {
            return this;
        }

        @Override
        public String getTitle() {
            return title;
        }

        public String getAuthor() {
            return "Agatha Christie";
        }
    }

    public static class MarkTwainBook extends Book {
        private final String title;

        public MarkTwainBook(String title) {
            super(title);
            this.title = title;
        }

        @Override
        public Book getBook() {
            return this;
        }

        @Override
        public String getAuthor() {
            return "Mark Twain";
        }

        @Override
        public String getTitle() {
            return title;
        }
    }

}
