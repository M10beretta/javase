package com.mber.topic.beginner.shildt._139_nested_operators_switch;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            extracted();
            System.out.println();
        }
    }

    private static void extracted() {
        int count = new Random().nextInt(2) + 1;
        int target = new Random().nextInt(2);

        switch (count) {
            case 1 -> {
                System.out.println("case 1");
                switch (target) { // вложенный оператор switch
                    case 0 -> System.out.println("target равно 0");
                    case 1 -> System.out.println("target равно 1");
                }
            }
            case 2 -> System.out.println("case 2");
        }
    }
}


