package com.mber.dmdev.level2.lesson7;

public class StaticRunner {
    public static void main(String[] args) {
        new Computer(null, null);
        new Computer(null, null);
        new Computer(null, null);
        new Computer(null, null);
        Computer computer = new Computer(null, null);
        Computer computer2 = new Computer(null, null);

        Class<? extends Computer> aClass = computer.getClass();
        Class<? extends Computer> aClass2 = computer2.getClass();
        System.out.println(aClass2 == aClass2);

        System.out.println(Computer.getCounter());
    }
}
