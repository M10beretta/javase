package com.mber.dmdev.level2.task1501;

public class TrainingGround {
    public static void main(String[] args) {
        Hero hero = new Hero("Hero");
        Warrior war = new Warrior("Warrior");
        Mage mag = new Mage("Mage");
        Archer arch = new Archer("Archer");


        attackEnemy(hero, war ,mag ,arch);


    }

    public static void attackEnemy(Hero... heroes) {
        for (Hero hero : heroes) {
        }
    }
}

