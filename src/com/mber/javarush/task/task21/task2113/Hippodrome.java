package com.mber.javarush.task.task21.task2113;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Hippodrome {
    public static void main(String[] args) {
        game = new Hippodrome(new ArrayList<>());
        game.getHorses().add(new Horse("Mary", 3, 0));
        game.getHorses().add(new Horse("Leroy", 3, 0));
        game.getHorses().add(new Horse("Hint", 3, 0));

        game.run();
        game.printWinner();
    }

    static Hippodrome game;
    private final List<Horse> horses;

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    public void run() {
        for (int i = 0; i < 100; i++) {
            move();
            print();
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public Horse getWinner(){
        return horses.stream().max(Comparator.comparingDouble(Horse::getDistance)).orElse(null);
    }

    public void printWinner(){
        System.out.printf("Winner is %s!", getWinner().getName());
    }

    public void move() {
        horses.forEach(Horse::move);
    }

    public void print() {
        horses.forEach(Horse::print);
        for (int i = 0; i < 10; i++) System.out.println();
    }

    public List<Horse> getHorses() {
        return horses;
    }

}
