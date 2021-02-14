package com.mber.dmdev.level2.lesson11;


public class Laptop extends Computer {
    private int weight;

    public Laptop(Ssd ssd, Ram ram , int weight) {
        super(ssd, ram);
        this.weight = weight;
    }

    @Override
    public void load() {
        open();
        System.out.println("laptop загрузился");
    }

    @Override
    public void print() {
        super.print();
        System.out.println("weight: " + weight);

    }

    public void open() {
        System.out.println("laptop открыл крышку");
    }

    public int getWeight() {
        return weight;
    }
}
