package com.mber.javarush.task.task14.task1417;

import java.util.ArrayList;
import java.util.List;

/*
Валюты
*/

public class Solution {
    public static void main(String[] args) {
        Person ivan = new Person("Иван");
        for (Money money : ivan.getAllMoney()) {
            System.out.println(ivan.name + " имеет заначку в размере "
                    + money.getAmount() + " " + money.getCurrencyName());
        }
    }

    static class Person {
        public String name;
        private final List<Money> allMoney;

        Person(String name) {
            this.name = name;
            this.allMoney = new ArrayList<Money>();
            allMoney.add(new Hryvnia(100000));
            allMoney.add(new Ruble(200000));
            allMoney.add(new USD(3000000));

        }

        public List<Money> getAllMoney() {
            return allMoney;
        }
    }
}

