package com.mber.topic.core.dmdev.level2.lesson7_class_composition;

public class Computer {
    private Ram ram;
    private Ssd ssd;
    public static int counter = 0;

    public Computer(Ram ram, Ssd ssd) {
        this.ram = ram;
        this.ssd = ssd;
        counter++;
    }

    public static int getCounter() {
        return counter;
    }

    public void printState() {
        System.out.println("Computer: ram " + ram.getValue() + ", ssd " + ssd.getValue());
    }

    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public Ssd getSsd() {
        return ssd;
    }

    public void setSsd(Ssd ssd) {
        this.ssd = ssd;
    }
}
