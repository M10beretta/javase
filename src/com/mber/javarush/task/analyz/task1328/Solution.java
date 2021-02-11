package com.mber.javarush.task.analyz.task1328;

public class Solution {
    public static void main(String[] args) {
        Robot amigo = new Robot("Амиго");
        Robot enemy = new Robot("Сгибальщик-02");

        doMove(amigo, enemy);
        doMove(amigo, enemy);
        doMove(enemy, amigo);
        doMove(amigo, enemy);
        doMove(enemy, amigo);
        doMove(amigo, enemy);
        doMove(enemy, amigo);
        doMove(amigo, enemy);
    }

    public static void doMove(Robot robotFirst, Robot robotScond) {
        BodyPart attacked = robotFirst.attack();
        BodyPart defensed = robotFirst.defense();
        System.out.printf("%s атаковал робота %s, атакована %s, защищена %s%n",
                robotFirst.getName(), robotScond.getName(), attacked, defensed);
    }
}
