package com.mber.javarush.task.task14.task1408;

/*
Куриная фабрика
*/

public class Solution {
    public static void main(String[] args) {
        HenFactory.getHen(Country.RUSSIA);
        HenFactory.getHen(Country.UKRAINE);
        HenFactory.getHen(Country.MOLDOVA);
        HenFactory.getHen(Country.BELARUS);
    }

    static class HenFactory {

        static void getHen(String country) {
            Hen hen;

            switch (country) {
                case Country.RUSSIA -> {
                    hen = new RussianHen();
                    System.out.println(hen.getDescription());
                }
                case Country.UKRAINE -> {
                    hen = new UkrainianHen();
                    System.out.println(hen.getDescription());
                }
                case Country.MOLDOVA -> {
                    hen = new MoldovanHen();
                    System.out.println(hen.getDescription());
                }
                case Country.BELARUS -> {
                    hen = new BelarusianHen();
                    System.out.println(hen.getDescription());
                }
            }
        }
    }
}

