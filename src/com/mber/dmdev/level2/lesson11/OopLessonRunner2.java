package com.mber.dmdev.level2.lesson11;

public class OopLessonRunner2 {
    public static void main(String[] args) {
        Printable laptop = new Laptop(new Ssd(250), new Ram(1024), 2);
        Printable mobile = new Mobile(new Ssd(125), new Ram(512));

        printWithRandom(laptop, mobile);
    }

    public static void print(Printable... objects) {
        for (Printable object : objects) {
            object.print();
            if (object instanceof Laptop) {
                ((Laptop) object).open();
            }
            System.out.println();
        }
    }

    public static void printWithRandom(Printable... objects) {
        for (Printable object : objects) {
            object.printWithRandom();
            if (object instanceof Laptop) {
                ((Laptop) object).open();
            }

            System.out.println();
        }
    }
}
