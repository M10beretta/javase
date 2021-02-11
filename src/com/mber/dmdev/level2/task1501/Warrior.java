package com.mber.dmdev.level2.task1501;

public class Warrior extends Hero {
    public Warrior(String name) {
        super(name);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(this.getName() + " атакует мечом");
        enemy.takeDamage(15);
    }
}
